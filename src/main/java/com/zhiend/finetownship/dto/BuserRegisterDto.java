package com.zhiend.finetownship.dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Zhiend
 * @version 1.0
 * @description: 用户注册信息
 * @date 2024/12/3 13:29
 */
@ApiModel("用户注册信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuserRegisterDto {
    @ApiModelProperty("用户注册名称")
    private String uname;

    @ApiModelProperty("证件类型，默认身份证")
    private String ctype;

    @ApiModelProperty("证件号码")
    private String idno;

    @ApiModelProperty("用户姓名")
    private String bname;

    @ApiModelProperty("密码")
    private String bpwd;

    @ApiModelProperty("联系电话")
    private String phoneNo;

    @ApiModelProperty("用户简介")
    private String remark;
}
