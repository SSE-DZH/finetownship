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
 * 乡镇信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("town_info")
public class TownInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 乡镇标识
     */
    @TableId(value = "town_id", type = IdType.AUTO)
    private String townId;

    /**
     * 乡镇名称
     */
    private String townName;

    /**
     * 城市标识
     */
    private String cityId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 省标识
     */
    private String provinceId;

    /**
     * 省名称
     */
    private String provinceName;


}
