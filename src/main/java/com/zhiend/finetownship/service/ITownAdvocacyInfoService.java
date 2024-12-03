package com.zhiend.finetownship.service;

import com.zhiend.finetownship.dto.TownAdvocacyInfoDto;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;

import java.io.IOException;

/**
 * <p>
 * 好乡镇宣传信息表 服务类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface ITownAdvocacyInfoService extends IService<TownAdvocacyInfo> {

    PageResult<TownAdvocacyInfo> queryPage(TownAdvocacyInfoQuery query);

    void add(TownAdvocacyInfoDto townAdvocacyInfoDto) throws IOException;
}
