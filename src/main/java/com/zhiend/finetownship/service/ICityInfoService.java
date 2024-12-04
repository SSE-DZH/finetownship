package com.zhiend.finetownship.service;

import com.zhiend.finetownship.entity.CityInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 城市信息表 服务类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface ICityInfoService extends IService<CityInfo> {

    List<String> queryAllProvs();

    List<String> queryAllCitys(String provinceName);
}
