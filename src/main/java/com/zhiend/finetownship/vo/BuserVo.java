package com.zhiend.finetownship.vo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 用户信息展示
 * @date 2024/12/3 13:31
 */
@ApiModel("用户信息展示")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuserVo {
    /**
     * 用户标识
     */
    @ApiModelProperty("用户标识")
    private Integer id;
    /**
     * 用户注册名称
     */
    @ApiModelProperty("用户注册名称")
    private String uname;
    /**
     * 证件类型，默认身份证
     */
    @ApiModelProperty("证件类型，默认身份证")
    private String ctype;
    /**
     * 证件号码
     */
    @ApiModelProperty("证件号码")
    private String idno;
    /**
     * 用户姓名
     */
    @ApiModelProperty("用户姓名")
    private String bname;
    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String bpwd;
    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    private String phoneNo;
    /**
     * 用户级别，默认普通用户
     */
    @ApiModelProperty("用户级别，默认普通用户")
    private String userLevel;
    /**
     * 用户简介
     */
    @ApiModelProperty("用户简介")
    private String remark;
}
