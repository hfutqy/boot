package com.qiyu.boot.processor.context;

/**
 * Created by qiyu on 2018/10/15.
 */
public interface IContext<T extends IContext> {

    T getContext();

}
