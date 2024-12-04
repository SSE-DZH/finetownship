package com.zhiend.finetownship.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 分页查询TownAdvocacyInfo条件
 * @date 2024/12/3 15:32
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("分页查询TownAdvocacyInfo条件")
@Data
public class TownAdvocacyInfoQuery extends Query{
    /**
     * 好乡镇宣传标题
     */
    @ApiModelProperty("好乡镇宣传标题")
    private String ptitle;

    /**
     * 好乡镇宣传类型标识
     */
    @ApiModelProperty("好乡镇宣传类型标识")
    private String type;

    /**
     * 被宣传的好乡镇名称
     */
    @ApiModelProperty("被宣传的好乡镇名称")
    private String townName;

    /**
     * 城市名称
     */
    @ApiModelProperty("城市名称")
    private String cityName;

    /**
     * 省名称
     */
    @ApiModelProperty("省名称")
    private String provinceName;
}
