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
 * @since 2024-12-03
 */
@TableName("city_info")
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 城市标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
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
            "id=" + id +
            ", cityName=" + cityName +
            ", provinceId=" + provinceId +
            ", provinceName=" + provinceName +
        "}";
    }
}
