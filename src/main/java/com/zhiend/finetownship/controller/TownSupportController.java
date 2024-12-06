package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.constant.MessageConstant;
import com.zhiend.finetownship.dto.TownSupportDto;
import com.zhiend.finetownship.entity.TownSupport;
import com.zhiend.finetownship.exception.GloabalException;
import com.zhiend.finetownship.query.PageResult;
import com.zhiend.finetownship.query.Query;
import com.zhiend.finetownship.query.TownSupportQuery;
import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.ITownSupportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Objects;


/**
 * <p>
 * 好乡镇宣传助力信息表 前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@RestController
@RequestMapping("/town-support")
@Api(tags = "宣传助力信息控制器")
@Slf4j
public class TownSupportController {
    @Resource
    private ITownSupportService townSupportService;

    @PostMapping("/query")
    @ApiOperation("宣传助力分页查询")
    public Result<PageResult<TownSupport>> querypage(TownSupportQuery query) {
        return Result.success(townSupportService.queryPage(query));
    }

    // 保存助力
    @PostMapping("/add")
    @ApiOperation("宣传助力保存")
    public Result<String> add(TownSupportDto townSupportDto) {
        log.info("宣传助力Dto：{}", townSupportDto);
        try {
            log.info("宣传助力Dto：{}", townSupportDto);
            if (Objects.isNull(townSupportDto.getSid()) || townSupportDto.getSid() < 1) {

                townSupportService.add(townSupportDto);
            } else {
                townSupportService.update(townSupportDto);
            }
        } catch (IOException e) {
            throw new GloabalException(MessageConstant.UPLOAD_FAILED);
        }
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    @DeleteMapping(value = "/delete")
    @ApiOperation("宣传助力删除")
    public Result<String> delete(@RequestParam("id") Integer sid) {
        try {
            townSupportService.delete(sid);
        } catch (Exception e) {
            throw new GloabalException("该助力已被接受，无法删除");
        }
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    // 查看用户自己的助力信息
    @PostMapping("/queryByName")
    @ApiOperation("用户自己的宣传助力信息查询")
    public Result<PageResult<TownSupport>> queryPageByName(@RequestParam("suserName") String suserName, Query query) {
        return Result.success(townSupportService.queryPageByName(suserName, query));
    }

    // 接受宣传助力
    @PostMapping("/accept")
    @ApiOperation("宣传助力接受")
    public Result<String> accept(@RequestParam("sid") Integer sid, @RequestParam(value = "remark") String remark) {
        townSupportService.accept(sid, remark);
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    // 拒绝宣传助力
    @PostMapping("/refuse")
    @ApiOperation("宣传助力拒绝")
    public Result<String> refuse(@RequestParam("sid") Integer sid) {
        townSupportService.refuse(sid);
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    // 查看待处理的宣传助力
    @PostMapping("/queryWaitHandle")
    @ApiOperation("宣传助力待处理查询")
    public Result<PageResult<TownSupport>> queryWaitHandle(@RequestParam String puserName, Query query) {
        return Result.success(townSupportService.queryWaitHandle(puserName, query));
    }

    // 根据sid 查询宣传助力信息
    @GetMapping("/queryBySid")
    @ApiOperation("根据sid查询宣传助力信息")
    public Result<TownSupport> queryBySid(@RequestParam("sid") Integer sid) {
        return Result.success(townSupportService.getById(sid));
    }
}
