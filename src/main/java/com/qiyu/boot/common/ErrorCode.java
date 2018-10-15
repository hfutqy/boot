package com.qiyu.boot.common;

/**
 * @author qiyu
 * @date 2018/10/15
 */
public enum ErrorCode {

    ;

    private int key;
    private String value;
    public int getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    private ErrorCode(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
