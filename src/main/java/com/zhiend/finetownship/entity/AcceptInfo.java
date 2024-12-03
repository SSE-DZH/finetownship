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
 * 助力成功记录表
 * </p>
 *
 * @author Zhiend
 * @since 2024-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("accept_info")
public class AcceptInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 助力成功记录标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 好乡镇宣传标识
     */
    private Integer pid;

    /**
     * 好乡镇助力标识
     */
    private Integer sid;

    /**
     * 达成日期
     */
    private LocalDateTime createDate;

    /**
     * 备注
     */
    private String remark;


}
