package com.qiyu.boot.processor;

import com.qiyu.boot.common.IBusinessProcessor;
import com.qiyu.boot.common.IBusinessType;
import com.qiyu.boot.processor.context.IContext;
import com.qiyu.boot.processor.result.IProcessResult;

import java.util.List;

/**
 * 分发处理器接口
 * @author qiyu
 * @date 2018/10/15
 */
public interface IDistributionProcessor {
    /**
     * 获取匹配的业务类型
     * @param businessType
     * @return
     */
    List<IBusinessProcessor> getBusinessProcessors(IBusinessType businessType);

    /**
     * 处理业务
     * @param context 上下文
     * @param businessType 业务类型
     * @return
     */
    IProcessResult process(String context, IBusinessType businessType) throws ProcessException;

    /**
     * 处理业务
     * @param context 上下文
     * @param businessType 业务类型
     * @return
     * @throws ProcessException
     */
    IProcessResult process(IContext context, IBusinessType businessType) throws ProcessException;
}
