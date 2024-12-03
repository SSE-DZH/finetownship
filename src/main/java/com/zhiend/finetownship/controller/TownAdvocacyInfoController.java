package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.constant.MessageConstant;
import com.zhiend.finetownship.dto.TownAdvocacyInfoDto;
import com.zhiend.finetownship.entity.TownAdvocacyInfo;
import com.zhiend.finetownship.exception.GloabalException;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.TownAdvocacyInfoQuery;
import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.ITownAdvocacyInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Objects;

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
@Slf4j
public class TownAdvocacyInfoController {
    @Resource
    private ITownAdvocacyInfoService townAdvocacyInfoService;

    @PostMapping("/query")
    @ApiOperation("宣传信息分页查询")
    public Result<PageResult<TownAdvocacyInfo>> querypage(TownAdvocacyInfoQuery query) {
        return Result.success(townAdvocacyInfoService.queryPage(query));
    }

    @PostMapping("/save")
    @ApiOperation("宣传信息保存")
    public Result<String> save(TownAdvocacyInfoDto townAdvocacyInfoDto) {
        // 打印Dto
        log.info("宣传信息Dto：{}", townAdvocacyInfoDto);
        try {
            if (Objects.isNull(townAdvocacyInfoDto.getPid()) || townAdvocacyInfoDto.getPid() < 1) {
                townAdvocacyInfoService.add(townAdvocacyInfoDto);
            } else {
                townAdvocacyInfoService.update(townAdvocacyInfoDto);
            }
        } catch (IOException e) {
            throw new GloabalException(MessageConstant.UPLOAD_FAILED);
        }
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    @DeleteMapping(value = "/delete")
    @ApiOperation("宣传信息删除")
    public Result<String> delete(@RequestParam("id") Integer id) {
        try {
            townAdvocacyInfoService.delete(id);
        } catch (IOException e) {
            throw new GloabalException(MessageConstant.OPERATION_FAILED);
        }
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }
}
