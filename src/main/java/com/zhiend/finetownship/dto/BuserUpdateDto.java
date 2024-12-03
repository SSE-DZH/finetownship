package com.zhiend.finetownship.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 用户更新信息
 * @date 2024/12/3 13:41
 */
@ApiModel("用户更新信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuserUpdateDto {
    /**
     * 用户标识
     */
    @ApiModelProperty("用户标识")
    private Integer id;

    @ApiModelProperty("密码")
    private String bpwd;

    @ApiModelProperty("联系电话")
    private String phoneNo;

    @ApiModelProperty("用户简介")
    private String remark;
}
