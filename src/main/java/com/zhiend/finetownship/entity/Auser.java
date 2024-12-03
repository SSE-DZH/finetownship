package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 管理员用户表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
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

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    @Override
    public String toString() {
        return "Auser{" +
            "aname=" + aname +
            ", apwd=" + apwd +
        "}";
    }
}
