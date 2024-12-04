package com.zhiend.finetownship.mapper;

import com.zhiend.finetownship.entity.CityInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 城市信息表 Mapper 接口
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
public interface CityInfoMapper extends BaseMapper<CityInfo> {

    @Select("SELECT DISTINCT province_name FROM city_info")
    List<String> queryAllProvs();

    @Select("SELECT city_name FROM city_info WHERE province_name = #{provinceName}")
    List<String> queryAllCitysByProvinceName(String provinceName);
}
