package com.zhiend.finetownship.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiend.finetownship.dto.TownSupportDto;
import com.zhiend.finetownship.entity.AcceptInfo;
import com.zhiend.finetownship.entity.TownSupport;
import com.zhiend.finetownship.exception.GloabalException;
import com.zhiend.finetownship.mapper.AcceptInfoMapper;
import com.zhiend.finetownship.mapper.TownSupportMapper;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownSupportQuery;
import com.zhiend.finetownship.service.ITownSupportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiend.finetownship.utils.FileUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * <p>
 * 好乡镇宣传助力信息表 服务实现类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Service
public class TownSupportServiceImpl extends ServiceImpl<TownSupportMapper, TownSupport> implements ITownSupportService {
    @Resource
    private TownSupportMapper townSupportMapper;
    @Resource
    private AcceptInfoMapper acceptInfoMapper;
    @Override
    public void add(TownSupportDto townSupportDto) throws IOException {
        TownSupport townSupport = new TownSupport();
        BeanUtil.copyProperties(townSupportDto, townSupport, true);
        townSupport.setSupportState(0);
        String sfileList = FileUtil.uploadFile(townSupportDto.getFiles());
        townSupport.setSfileList(sfileList);
        townSupportMapper.insert(townSupport);
    }

    @Override
    public void update(TownSupportDto townSupportDto) throws IOException {
        if (checkIsAccepted(townSupportDto.getSid())) {
            throw new GloabalException("该助力已被接受，无法更改");
        }
        // 根据sid 查询实体
        TownSupport townSupport = townSupportMapper.selectById(townSupportDto.getSid());
        BeanUtil.copyProperties(townSupportDto, townSupport, true);
        // 根据实体中的文件数组，删除对应的文件，同时对数据库进行更新
        if (townSupportDto.getFiles() != null) {
            String originSfileList = townSupport.getSfileList();
            // 调用工具类删除文件
            FileUtil.deleteFiles(originSfileList);
            // 更新字段
            String sfileList = FileUtil.uploadFile(townSupportDto.getFiles());
            townSupport.setSfileList(sfileList);
        }
        townSupportMapper.updateById(townSupport);
    }

    @Override
    public PageResult<TownSupport> queryPage(TownSupportQuery query) {
        // 创建分页对象
        IPage<TownSupport> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownSupport> iPage = townSupportMapper.queryPage(page, query);
        return buildPageResult(iPage);
    }

    @Override
    public void delete(Integer sid) throws IOException {
        if (checkIsAccepted(sid)) {
            throw new GloabalException("该助力已被接受，无法删除");
        }
        TownSupport townSupport = townSupportMapper.selectById(sid);
        FileUtil.deleteFiles(townSupport.getSfileList());
        townSupportMapper.deleteById(sid);
    }

    @Override
    public PageResult<TownSupport> queryPageByName(String suserName, Query query) {
        // 创建分页对象
        IPage<TownSupport> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownSupport> iPage = townSupportMapper.queryPageByName(suserName, page, query);
        return buildPageResult(iPage);
    }

    @Override
    public void accept(Integer sid, String remark) {
        // 根据sid 查询实体
        TownSupport townSupport = townSupportMapper.selectById(sid);
        townSupport.setSupportState(1);
        townSupportMapper.updateById(townSupport);
        AcceptInfo acceptInfo = new AcceptInfo();
        acceptInfo.setSid(sid);
        acceptInfo.setPid(townSupport.getPid());
        acceptInfo.setRemark(remark);
        acceptInfoMapper.insert(acceptInfo);
    }

    @Override
    public void refuse(Integer sid) {
        // 根据sid 查询实体
        TownSupport townSupport = townSupportMapper.selectById(sid);
        townSupport.setSupportState(2);
        townSupportMapper.updateById(townSupport);
    }

    @Override
    public PageResult<TownSupport> queryWaitHandle(String puserName, Query query) {
        // 创建分页对象
        IPage<TownSupport> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownSupport> iPage = townSupportMapper.queryWaitHandle(puserName, page, query);
        return buildPageResult(iPage);
    }


    private PageResult<TownSupport> buildPageResult(IPage<TownSupport> iPage) {
        PageResult<TownSupport> pageResult = new PageResult<>();
        pageResult.setTotalPage(iPage.getPages());
        pageResult.setTotalNum(iPage.getTotal());
        pageResult.setCurrentPage(iPage.getCurrent());
        pageResult.setContentList(iPage.getRecords());
        return pageResult;
    }

    private boolean checkIsAccepted (Integer sid) {
        QueryWrapper<AcceptInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sid", sid);
        return acceptInfoMapper.selectCount(queryWrapper) > 0;
    }
}
