package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 助力成功记录表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@TableName("accept_info")
public class AcceptInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 助力成功记录标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 好乡镇宣传标识
     */
    private Integer pid;

    /**
     * 好乡镇助力标识
     */
    private Integer sid;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "AcceptInfo{" +
            "id=" + id +
            ", pid=" + pid +
            ", sid=" + sid +
            ", createDate=" + createDate +
            ", remark=" + remark +
        "}";
    }
}
