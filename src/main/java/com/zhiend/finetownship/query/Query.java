package com.zhiend.finetownship.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 分页查询参数
 * @date 2024/11/28 14:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Query {
    // 分页参数：页码
    @ApiModelProperty("页码")
    private int pageNo;
    // 分页参数：每页条数
    @ApiModelProperty("每页条数")
    private int pageSize;
}