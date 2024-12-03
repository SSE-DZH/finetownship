package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 好乡镇宣传统计报表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@TableName("report")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报告id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 统计月份
     */
    private String monthId;

    /**
     * 好乡镇宣传类型id
     */
    private Integer ptypeId;

    /**
     * 好乡镇id
     */
    private String townId;

    /**
     * 月累计宣传用户数
     */
    private Integer puserNum;

    /**
     * 月累计助力用户数
     */
    private Integer suserNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }
    public Integer getPtypeId() {
        return ptypeId;
    }

    public void setPtypeId(Integer ptypeId) {
        this.ptypeId = ptypeId;
    }
    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }
    public Integer getPuserNum() {
        return puserNum;
    }

    public void setPuserNum(Integer puserNum) {
        this.puserNum = puserNum;
    }
    public Integer getSuserNum() {
        return suserNum;
    }

    public void setSuserNum(Integer suserNum) {
        this.suserNum = suserNum;
    }

    @Override
    public String toString() {
        return "Report{" +
            "id=" + id +
            ", monthId=" + monthId +
            ", ptypeId=" + ptypeId +
            ", townId=" + townId +
            ", puserNum=" + puserNum +
            ", suserNum=" + suserNum +
        "}";
    }
}
