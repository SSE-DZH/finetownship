package com.zhiend.finetownship.exception;

/**
 * @author Zhiend
 * @version 1.0
 * @description: 业务异常
 * @date 2024/12/3 1:53
 */
public class BaseException extends RuntimeException{
    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }
}
