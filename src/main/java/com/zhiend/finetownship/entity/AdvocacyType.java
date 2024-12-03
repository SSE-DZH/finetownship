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
 * 好乡镇宣传类型表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
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


}
