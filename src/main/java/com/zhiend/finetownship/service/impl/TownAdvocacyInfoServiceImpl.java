package com.zhiend.finetownship.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiend.finetownship.dto.TownAdvocacyInfoDto;
import com.zhiend.finetownship.entity.AcceptInfo;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.zhiend.finetownship.exception.GloabalException;
import com.zhiend.finetownship.mapper.AcceptInfoMapper;
import com.zhiend.finetownship.mapper.TownAdvocacyInfoMapper;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;
import com.zhiend.finetownship.service.ITownAdvocacyInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiend.finetownship.utils.BeanCopyUtil;
import com.zhiend.finetownship.utils.FileUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * <p>
 * 好乡镇宣传信息表 服务实现类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Service
public class TownAdvocacyInfoServiceImpl extends ServiceImpl<TownAdvocacyInfoMapper, TownAdvocacyInfo> implements ITownAdvocacyInfoService {

    @Resource
    private TownAdvocacyInfoMapper townAdvocacyInfoMapper;
    @Resource
    private AcceptInfoMapper acceptInfoMapper;
    @Override
    public PageResult<TownAdvocacyInfo> queryPage(TownAdvocacyInfoQuery query) {
        // 创建分页对象
        IPage<TownAdvocacyInfo> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownAdvocacyInfo> iPage = townAdvocacyInfoMapper.queryPage(page, query);

        // 将查询结果封装成PageResult对象并返回
        return buildPageResult(iPage);
    }

    @Override
    public void add(TownAdvocacyInfoDto townAdvocacyInfoDto) throws IOException {
        String pfileList = FileUtil.uploadFile(townAdvocacyInfoDto.getFiles());
        TownAdvocacyInfo townAdvocacyInfo = new TownAdvocacyInfo();
        BeanCopyUtil.copyProperties(townAdvocacyInfoDto, townAdvocacyInfo);
        townAdvocacyInfo.setPstate(0);
        townAdvocacyInfo.setPfileList(pfileList);
        townAdvocacyInfoMapper.insert(townAdvocacyInfo);
    }

    @Override
    public void update(TownAdvocacyInfoDto townAdvocacyInfoDto) throws IOException{
        // 检查是否已被助力
        if (checkIsSupported(townAdvocacyInfoDto.getPid())) {
            throw new GloabalException("已被助力，无法更改");
        }
        // 根据pid查询实体
        TownAdvocacyInfo townAdvocacyInfo = townAdvocacyInfoMapper.selectById(townAdvocacyInfoDto.getPid());
        BeanCopyUtil.copyProperties(townAdvocacyInfoDto, townAdvocacyInfo);
        // 根据实体中的文件数组，删除对应的文件，同时对数据库进行更新
        if (townAdvocacyInfoDto.getFiles() != null) {
            String originPfileList = townAdvocacyInfo.getPfileList();
            // 调用工具类删除文件
            FileUtil.deleteFiles(originPfileList);
            // 更新字段
            String pfileList = FileUtil.uploadFile(townAdvocacyInfoDto.getFiles());
            townAdvocacyInfo.setPfileList(pfileList);
        }
        townAdvocacyInfo.setPupdateDate(LocalDateTime.now());
        townAdvocacyInfoMapper.updateById(townAdvocacyInfo);
    }

    @Override
    public void delete(Integer pid) throws IOException {
        // 根据pid查询助力成功记录表中有没有该宣传信息，有则无法删除，没有则可以删除
        if (checkIsSupported(pid)) {
            throw new GloabalException("已被助力，无法删除");
        }
        // 根据pid查询实体
        TownAdvocacyInfo townAdvocacyInfo = townAdvocacyInfoMapper.selectById(pid);
        FileUtil.deleteFiles(townAdvocacyInfo.getPfileList());
        townAdvocacyInfoMapper.deleteById(pid);
    }

    @Override
    public PageResult<TownAdvocacyInfo> queryPageByName(String puserName, Query query) {
        // 创建分页对象
        IPage<TownAdvocacyInfo> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownAdvocacyInfo> iPage = townAdvocacyInfoMapper.queryPageByName(puserName, page, query);

        // 将查询结果封装成PageResult对象并返回
        return buildPageResult(iPage);
    }

    private PageResult<TownAdvocacyInfo> buildPageResult(IPage<TownAdvocacyInfo> iPage) {
        PageResult<TownAdvocacyInfo> pageResult = new PageResult<>();
        pageResult.setTotalPage(iPage.getPages());
        pageResult.setTotalNum(iPage.getTotal());
        pageResult.setCurrentPage(iPage.getCurrent());
        pageResult.setContentList(iPage.getRecords());
        return pageResult;
    }

    private boolean checkIsSupported (Integer pid) {
        QueryWrapper<AcceptInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pid", pid);
        return acceptInfoMapper.selectCount(queryWrapper) > 0;
    }


}
