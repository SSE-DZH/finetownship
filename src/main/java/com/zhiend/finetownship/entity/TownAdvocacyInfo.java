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
 * @since 2024-12-04
 */
@TableName("town_advocacy_info")
public class TownAdvocacyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好乡镇宣传id
     */
    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    /**
     * 好乡镇宣传标题
     */
    private String ptitle;

    /**
     * 好乡镇宣传类型
     */
    private String type;

    /**
     * 发布该好乡镇宣传的用户名
     */
    private String puserName;

    /**
     * 被宣传的好乡镇名称
     */
    private String townName;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 省名称
     */
    private String provinceName;

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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getPuserName() {
        return puserName;
    }

    public void setPuserName(String puserName) {
        this.puserName = puserName;
    }
    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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
            ", type=" + type +
            ", puserName=" + puserName +
            ", townName=" + townName +
            ", cityName=" + cityName +
            ", provinceName=" + provinceName +
            ", pdesc=" + pdesc +
            ", pfileList=" + pfileList +
            ", pbeginDate=" + pbeginDate +
            ", pstate=" + pstate +
            ", pupdateDate=" + pupdateDate +
        "}";
    }
}
