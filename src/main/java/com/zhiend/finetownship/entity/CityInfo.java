package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 城市信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-04
 */
@TableName("city_info")
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 城市id
     */
    @TableId(value = "city_id", type = IdType.AUTO)
    private Integer cityId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 省名称
     */
    private String provinceName;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    @Override
    public String toString() {
        return "CityInfo{" +
            "cityId=" + cityId +
            ", cityName=" + cityName +
            ", provinceName=" + provinceName +
        "}";
    }
}
