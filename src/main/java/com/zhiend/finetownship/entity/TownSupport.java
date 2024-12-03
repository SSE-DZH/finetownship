package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 好乡镇宣传助力信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@TableName("town_support")
public class TownSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好乡镇宣传助力标识
     */
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 助力用户标识
     */
    private Integer suserId;

    /**
     * 对应的好乡镇宣传标识
     */
    private Integer pid;

    /**
     * 助力标题
     */
    private String stitle;

    /**
     * 助力描述
     */
    private String sdesc;

    /**
     * 创建日期
     */
    private LocalDateTime supportDate;

    /**
     * 状态，0：待接受；1：已接受；2：拒绝；3：取消
     */
    private Boolean supportState;

    /**
     * 修改日期
     */
    private LocalDateTime updateDate;

    /**
     * 上传的介绍图片等文件名称列表
     */
    private String sfileList;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public Integer getSuserId() {
        return suserId;
    }

    public void setSuserId(Integer suserId) {
        this.suserId = suserId;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }
    public String getSdesc() {
        return sdesc;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }
    public LocalDateTime getSupportDate() {
        return supportDate;
    }

    public void setSupportDate(LocalDateTime supportDate) {
        this.supportDate = supportDate;
    }
    public Boolean getSupportState() {
        return supportState;
    }

    public void setSupportState(Boolean supportState) {
        this.supportState = supportState;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    public String getSfileList() {
        return sfileList;
    }

    public void setSfileList(String sfileList) {
        this.sfileList = sfileList;
    }

    @Override
    public String toString() {
        return "TownSupport{" +
            "sid=" + sid +
            ", suserId=" + suserId +
            ", pid=" + pid +
            ", stitle=" + stitle +
            ", sdesc=" + sdesc +
            ", supportDate=" + supportDate +
            ", supportState=" + supportState +
            ", updateDate=" + updateDate +
            ", sfileList=" + sfileList +
        "}";
    }
}
