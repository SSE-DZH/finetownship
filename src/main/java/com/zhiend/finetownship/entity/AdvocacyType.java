package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 好乡镇宣传类型表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@TableName("advocacy_type")
public class AdvocacyType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好乡镇宣传类型id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 好乡镇宣传类型
     */
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AdvocacyType{" +
            "id=" + id +
            ", type=" + type +
        "}";
    }
}
