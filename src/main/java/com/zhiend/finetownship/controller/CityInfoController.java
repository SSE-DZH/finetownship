package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.ICityInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市信息表 前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@RestController
@RequestMapping("/city-info")
@Api(tags = "城市信息控制器")
public class CityInfoController {
    @Resource
    private ICityInfoService cityInfoService;

    // 查询所有的省份
    @GetMapping("/queryAllProvs")
    @ApiOperation("查询所有的省份")
    public Result<List<String>> queryAllProvs() {
        return Result.success(cityInfoService.queryAllProvs());
    }

    // 根据省名查询所有的城市
    @GetMapping("/queryAllCitys")
    @ApiOperation("根据省名查询所有的城市")
    public Result<List<String>> queryAllCitys(String provinceName) {
        return Result.success(cityInfoService.queryAllCitys(provinceName));
    }
}
