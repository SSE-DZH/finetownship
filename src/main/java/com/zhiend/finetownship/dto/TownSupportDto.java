package com.zhiend.finetownship.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 好乡镇宣传信息助力传输对象
 * @date 2024/12/4 12:56
 */
@Data
@ApiModel("好乡镇宣传信息助力传输对象")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TownSupportDto {
    /**
     * 好乡镇宣传助力id
     */
    @ApiModelProperty("助力id, 更新助力专用")
    private Integer sid;
    /**
     * 助力用户名
     */
    @ApiModelProperty("助力用户名，新增助力专用")
    private String suserName;
    /**
     * 对应的好乡镇宣传id
     */
    @ApiModelProperty("对应的好乡镇宣传id，新增助力专用")
    private Integer pid;

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

    /**
     * 好乡镇助力图片
     */
    @ApiModelProperty("上传的文件，每个不超过10MB，总共不超过100MB，需要前端检验")
    private MultipartFile[] files;
}
