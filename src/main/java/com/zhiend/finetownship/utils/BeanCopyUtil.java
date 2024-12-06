package com.zhiend.finetownship.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 重写BeanCopy
 * @date 2024/12/6 16:51
 */
public class BeanCopyUtil {
    // 创建一个全局的CopyOptions实例，设置为默认配置
    private static final CopyOptions DEFAULT_COPY_OPTIONS = CopyOptions.create()
            .setIgnoreNullValue(true)
            .setIgnoreError(true);

    /**
     * 复制属性，使用全局默认配置
     * @param source 源对象
     * @param target 目标对象
     */
    public static void copyProperties(Object source, Object target) {
        BeanUtil.copyProperties(source, target, DEFAULT_COPY_OPTIONS);
    }


}
