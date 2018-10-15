package com.qiyu.boot.processor;

import com.qiyu.boot.common.ErrorCode;

/**
 * 处理异常
 * @author qiyu
 * @date 2018/10/15
 */
public class ProcessException extends RuntimeException{

    private final ErrorCode errorCode;

    public ProcessException(ErrorCode errorCode) {
        super(errorCode.getValue());
        this.errorCode = errorCode;
    }

    public ProcessException(ErrorCode errorCode, Exception e) {
        super(e);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
