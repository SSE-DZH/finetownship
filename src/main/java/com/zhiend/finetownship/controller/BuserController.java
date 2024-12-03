package com.zhiend.finetownship.controller;


import com.zhiend.finetownship.constant.MessageConstant;
import com.zhiend.finetownship.dto.BuserRegisterDto;
import com.zhiend.finetownship.dto.BuserUpdateDto;
import com.zhiend.finetownship.dto.LoginDto;
import com.zhiend.finetownship.result.Result;
import com.zhiend.finetownship.service.IBuserService;
import com.zhiend.finetownship.vo.BuserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@RestController
@RequestMapping("/buser")
@Api(tags = "业务用户控制器")
public class BuserController {
    @Resource
    private IBuserService buserService;

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public Result<String> register(@RequestBody BuserRegisterDto registerDto) {
        buserService.register(registerDto);
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    @GetMapping("/view")
    @ApiOperation("用户信息查询")
    public Result<BuserVo> view(@RequestParam("id") Integer id) {
        BuserVo buserVo = buserService.view(id);
        return Result.success(buserVo);
    }

    @PostMapping("/update")
    @ApiOperation("用户信息更新")
    public Result<String> update(@RequestBody BuserUpdateDto updateDto) {
        buserService.updateUser(updateDto);
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }

    @ApiOperation("账户登录")
    @PostMapping("/login")
    public Result<BuserVo> login(@RequestBody LoginDto loginDto) {
        BuserVo buserVo = buserService.login(loginDto);
        return Result.success(buserVo);
    }

    @ApiOperation("账户退出")
    @PostMapping("/logout")
    public Result<String> logout() {
        return Result.success(MessageConstant.OPERATION_SUCCESS);
    }
}
