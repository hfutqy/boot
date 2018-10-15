package com.qiyu.boot.common;

import com.qiyu.boot.processor.context.IContext;
import com.qiyu.boot.processor.result.IProcessResult;

/**
 * 业务处理器
 * Created by qiyu on 2018/10/15.
 */
public interface IBusinessProcessor<T extends IContext, R extends IProcessResult> {


    /**
     * 是否匹配指定的业务类型
     * @param businessType 业务类型
     * @return true or false
     */
    boolean match(IBusinessType businessType);

    /**
     * 处理业务
     * @param context 上下文
     * @return 非空
     */
    R process(T context);
}



