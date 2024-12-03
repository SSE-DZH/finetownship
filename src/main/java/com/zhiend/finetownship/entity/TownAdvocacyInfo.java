package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 好乡镇宣传信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@TableName("town_advocacy_info")
public class TownAdvocacyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好乡镇宣传标识
     */
    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    /**
     * 好乡镇宣传标题
     */
    private String ptitle;

    /**
     * 好乡镇宣传类型标识
     */
    private Integer ptypeId;

    /**
     * 发布该好乡镇宣传的用户标识
     */
    private Integer puserId;

    /**
     * 被宣传的好乡镇标识
     */
    private Integer townId;

    /**
     * 好乡镇宣传描述
     */
    private String pdesc;

    /**
     * 上传的图片等资源文件名称列表
     */
    private String pfileList;

    /**
     * 开始宣传日期，默认提交日期
     */
    private LocalDateTime pbeginDate;

    /**
     * 状态，0：已发布；-1：已取消
     */
    private Integer pstate;

    /**
     * 修改日期
     */
    private LocalDateTime pupdateDate;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }
    public Integer getPtypeId() {
        return ptypeId;
    }

    public void setPtypeId(Integer ptypeId) {
        this.ptypeId = ptypeId;
    }
    public Integer getPuserId() {
        return puserId;
    }

    public void setPuserId(Integer puserId) {
        this.puserId = puserId;
    }
    public Integer getTownId() {
        return townId;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }
    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }
    public String getPfileList() {
        return pfileList;
    }

    public void setPfileList(String pfileList) {
        this.pfileList = pfileList;
    }
    public LocalDateTime getPbeginDate() {
        return pbeginDate;
    }

    public void setPbeginDate(LocalDateTime pbeginDate) {
        this.pbeginDate = pbeginDate;
    }
    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }
    public LocalDateTime getPupdateDate() {
        return pupdateDate;
    }

    public void setPupdateDate(LocalDateTime pupdateDate) {
        this.pupdateDate = pupdateDate;
    }

    @Override
    public String toString() {
        return "TownAdvocacyInfo{" +
            "pid=" + pid +
            ", ptitle=" + ptitle +
            ", ptypeId=" + ptypeId +
            ", puserId=" + puserId +
            ", townId=" + townId +
            ", pdesc=" + pdesc +
            ", pfileList=" + pfileList +
            ", pbeginDate=" + pbeginDate +
            ", pstate=" + pstate +
            ", pupdateDate=" + pupdateDate +
        "}";
    }
}
