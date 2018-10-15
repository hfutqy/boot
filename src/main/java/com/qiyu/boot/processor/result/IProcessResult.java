package com.qiyu.boot.processor.result;

/**
 * Created by qiyu on 2018/10/15.
 * @author qiyu
 */
public interface IProcessResult<T extends IProcessResult> {
    /**
     * 是否成功
     */
    boolean isSuccess();

    /**
     * 备注
     */
    String getRemark();

}
