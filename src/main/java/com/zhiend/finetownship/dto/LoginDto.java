package com.zhiend.finetownship.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 登录参数
 * @date 2024/12/3 14:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("登录参数")
public class LoginDto {
    /**
     * 用户名
     */
    @ApiModelProperty("用户注册名称")
    private String uname;
    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String bpwd;
}
