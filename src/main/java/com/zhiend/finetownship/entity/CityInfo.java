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
 * 城市信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("city_info")
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 城市标识
     */
    @TableId(value = "city_id", type = IdType.AUTO)
    private Integer cityId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 省标识
     */
    private Integer provinceId;

    /**
     * 省名称
     */
    private String provinceName;


}
