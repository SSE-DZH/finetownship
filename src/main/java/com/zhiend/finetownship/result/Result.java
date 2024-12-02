package com.zhiend.finetownship.result;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 统一返回结果
 * @date 2024/11/11 11:27
 */
@Data
public class Result<T> implements Serializable {

    private Integer code; //编码：200成功，0和其它数字为失败
    private String msg; //错误信息
    private T data; //数据
    private boolean success;

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code = 200;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 200;
        result.success = true;
        return result;
    }

    public static <T> Result<T> success(T object, String msg) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 200;
        result.success = true;
        result.msg = msg;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
