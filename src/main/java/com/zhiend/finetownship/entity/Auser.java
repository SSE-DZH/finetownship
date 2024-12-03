package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 管理员用户表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("auser")
public class Auser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员用户名
     */
    @TableId(value = "aname", type = IdType.AUTO)
    private String aname;

    /**
     * 管理员密码
     */
    private String apwd;


}
