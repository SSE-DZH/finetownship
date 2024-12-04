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
 * @description: 分页查询TownSupport条件
 * @date 2024/12/4 13:42
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("分页查询TownSupport条件")
@Data
public class TownSupportQuery extends Query{
    /**
     * 助力的好乡镇宣传标题
     */
    @ApiModelProperty("助力的好乡镇宣传标题")
    private String ptitle;
    /**
     * 助力的好乡镇宣传类型
     */
    @ApiModelProperty("助力的好乡镇宣传类型")
    private String type;
    /**
     * 助力的好乡镇名称
     */
    @ApiModelProperty("助力的好乡镇名称")
    private String townName;
    /**
     * 助力的好乡镇所属城市名
     */
    @ApiModelProperty("助力的好乡镇所属城市名")
    private String cityName;

    /**
     * 助力的好乡镇所属省
     */
    @ApiModelProperty("助力的好乡镇所属省名")
    private String provinceName;
    /**
     * 助力标题
     */
    @ApiModelProperty("助力标题")
    private String stitle;
    /**
     * 助力描述
     */
    @ApiModelProperty("助力描述")
    private String sdesc;
}
