package com.zhiend.finetownship.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 好乡镇宣传助力信息表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("town_support")
public class TownSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好乡镇宣传助力标识
     */
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 助力用户标识
     */
    private Integer suserId;

    /**
     * 对应的好乡镇宣传标识
     */
    private Integer pid;

    /**
     * 助力标题
     */
    private String stitle;

    /**
     * 助力描述
     */
    private String sdesc;

    /**
     * 创建日期
     */
    private LocalDateTime supportDate;

    /**
     * 状态，0：待接受；1：已接受；2：拒绝；3：取消
     */
    private Boolean supportState;

    /**
     * 修改日期
     */
    private LocalDateTime updateDate;

    /**
     * 上传的介绍图片等文件名称列表
     */
    private String sfileList;


}
