package com.zhiend.finetownship.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 分页参数
 * @date 2024/11/28 14:48
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
@ApiModel("分页参数")
public class PageResult<T> {

    private static final long serialVersionUID=1L;

    /**
     * 总页数
     */
    @ApiModelProperty("总页数")
    private long totalPage;

    /**
     * 当前页数
     */
    @ApiModelProperty("当前页数")
    private long currentPage;

    /**
     * 总数
     */
    @ApiModelProperty("总数")
    private long totalNum;

    /**
     * 内容
     */
    @ApiModelProperty("内容")
    private List<T> contentList;
}

