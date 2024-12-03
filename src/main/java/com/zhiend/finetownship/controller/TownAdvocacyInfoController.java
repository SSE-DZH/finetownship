package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.constant.MessageConstant;
import com.zhiend.finetownship.dto.TownAdvocacyInfoDto;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;
import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.ITownAdvocacyInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 好乡镇宣传信息表 前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@RestController
@RequestMapping("/town-advocacy-info")
@Api(tags = "宣传信息界面")
public class TownAdvocacyInfoController {
    @Resource
    private ITownAdvocacyInfoService townAdvocacyInfoService;

    @PostMapping("/query")
    @ApiOperation("宣传信息分页查询")
    public Result<PageResult<TownAdvocacyInfo>> querypage(TownAdvocacyInfoQuery query) {
        return Result.success(townAdvocacyInfoService.queryPage(query));
    }

    @PostMapping("/add")
    @ApiOperation("宣传信息添加")
    public Result<String> add(TownAdvocacyInfoDto townAdvocacyInfoDto) {
        townAdvocacyInfoService.add(townAdvocacyInfoDto);
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }
}
