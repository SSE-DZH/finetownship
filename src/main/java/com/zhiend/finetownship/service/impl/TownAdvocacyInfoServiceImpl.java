package com.zhiend.finetownship.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.zhiend.finetownship.mapper.TownAdvocacyInfoMapper;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;
import com.zhiend.finetownship.service.ITownAdvocacyInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    @Override
    public PageResult<TownAdvocacyInfo> queryPage(TownAdvocacyInfoQuery query) {
        // 创建分页对象
        IPage<TownAdvocacyInfo> page = new Page<>(query.getPageNo(), query.getPageSize());
        // 执行分页查询
        IPage<TownAdvocacyInfo> iPage = townAdvocacyInfoMapper.queryPage(page, query);

        // 将查询结果封装成PageResult对象并返回
        PageResult<TownAdvocacyInfo> pageResult = new PageResult<>();
        pageResult.setTotalPage(iPage.getTotal());
        pageResult.setTotalNum(iPage.getTotal());
        pageResult.setCurrentPage(iPage.getCurrent());
        pageResult.setContentList(iPage.getRecords());

        return pageResult;
    }
}
