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
 * 好乡镇宣传统计报表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
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
     * 好乡镇宣传类型标识
     */
    private Integer ptypeId;

    /**
     * 好乡镇标识
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


}
