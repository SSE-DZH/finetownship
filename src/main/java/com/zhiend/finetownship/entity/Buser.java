package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("buser")
public class Buser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户注册名称
     */
    private String uname;

    /**
     * 证件类型，默认身份证
     */
    private String ctype;

    /**
     * 证件号码
     */
    private String idno;

    /**
     * 用户姓名
     */
    private String bname;

    /**
     * 密码
     */
    private String bpwd;

    /**
     * 联系电话
     */
    private String phoneNo;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime udateTime;

    /**
     * 用户级别，默认普通用户
     */
    private String userLevel;

    /**
     * 用户简介
     */
    private String remark;


}
