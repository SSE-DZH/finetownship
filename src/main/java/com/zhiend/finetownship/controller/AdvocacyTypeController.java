package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.entity.AdvocacyType;
import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.IAdvocacyTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 好乡镇宣传类型表 前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@RestController
@RequestMapping("/advocacy-type")
@Api(tags = "宣传类型控制器")
public class AdvocacyTypeController {
    @Resource
    private IAdvocacyTypeService advocacyTypeService;

    // 查询所有宣传类型
    @GetMapping("/queryAll")
    @ApiOperation("查询所有宣传类型")
    public Result<List<AdvocacyType>> queryAll() {
        return Result.success(advocacyTypeService.list());
    }
}
