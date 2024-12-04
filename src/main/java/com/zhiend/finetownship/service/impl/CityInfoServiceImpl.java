package com.zhiend.finetownship.service.impl;

import com.zhiend.finetownship.entity.CityInfo;
import com.zhiend.finetownship.mapper.CityInfoMapper;
import com.zhiend.finetownship.service.ICityInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市信息表 服务实现类
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo> implements ICityInfoService {
    @Resource
    private CityInfoMapper cityInfoMapper;
    @Override
    public List<String> queryAllProvs() {
        return cityInfoMapper.queryAllProvs();
    }

    @Override
    public List<String> queryAllCitys(String provinceName) {
        return cityInfoMapper.queryAllCitysByProvinceName(provinceName);
    }
}
