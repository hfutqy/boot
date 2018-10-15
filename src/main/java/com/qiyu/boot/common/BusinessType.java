package com.qiyu.boot.common;

/**
 * 业务类型
 * Created by qiyu on 2018/10/15.
 */
public enum BusinessType implements IBusinessType {
    //类型A
    QUERY(1, "A"),
    SELECT(1, "B");

    private int key;
    private String value;

    BusinessType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
