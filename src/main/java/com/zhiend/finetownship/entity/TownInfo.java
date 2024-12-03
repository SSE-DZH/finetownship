package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 乡镇信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
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

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }
    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
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
        return "TownInfo{" +
            "townId=" + townId +
            ", townName=" + townName +
            ", cityId=" + cityId +
            ", cityName=" + cityName +
            ", provinceId=" + provinceId +
            ", provinceName=" + provinceName +
        "}";
    }
}
