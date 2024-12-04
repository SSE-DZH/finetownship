package com.zhiend.finetownship.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 好乡镇宣传信息传输对象
 * @date 2024/12/3 16:49
 */
@Data
@ApiModel("好乡镇宣传信息传输对象")
@ToString
public class TownAdvocacyInfoDto {
    /**
     * 主键
     */
    @ApiModelProperty("主键，更新专用字段")
    private Integer pid;
    /**
     * 好乡镇宣传标题
     */
    @ApiModelProperty("宣传标题")
    private String ptitle;
    /**
     * 好乡镇宣传类型
     */
    @ApiModelProperty("宣传类型")
    private String type;
    /**
     * 发布该好乡镇宣传的用户名
     */
    @ApiModelProperty("宣传发布用户名，新增专用字段")
    private String puserName;
    /**
     * 被宣传的好乡镇名称
     */
    @ApiModelProperty("被宣传的好乡镇名称，新增专用字段")
    private String townName;
    /**
     * 城市名称
     */
    @ApiModelProperty("城市名称，新增专用字段")
    private String cityName;

    /**
     * 省名称
     */
    @ApiModelProperty("省名称，新增专用字段")
    private String provinceName;
    /**
     * 好乡镇宣传描述
     */
    @ApiModelProperty("宣传描述")
    private String pdesc;
    /**
     * 好乡镇宣传图片
     */
    @ApiModelProperty("上传的文件，每个不超过10MB，总共不超过100MB，需要前端检验")
    private MultipartFile[] files;
}
