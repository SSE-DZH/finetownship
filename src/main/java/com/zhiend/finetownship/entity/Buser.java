package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 用户级别，默认普通用户
     */
    private String userLevel;

    /**
     * 用户简介
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getBpwd() {
        return bpwd;
    }

    public void setBpwd(String bpwd) {
        this.bpwd = bpwd;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Buser{" +
            "id=" + id +
            ", uname=" + uname +
            ", ctype=" + ctype +
            ", idno=" + idno +
            ", bname=" + bname +
            ", bpwd=" + bpwd +
            ", phoneNo=" + phoneNo +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", userLevel=" + userLevel +
            ", remark=" + remark +
        "}";
    }
}
