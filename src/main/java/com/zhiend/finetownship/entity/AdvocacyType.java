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
     * 好乡镇宣传类型标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 好乡镇宣传类型名称
     */
    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "AdvocacyType{" +
            "id=" + id +
            ", typeName=" + typeName +
        "}";
    }
}
