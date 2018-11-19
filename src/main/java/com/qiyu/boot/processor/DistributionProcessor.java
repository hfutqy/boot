package com.qiyu.boot.processor;

import com.qiyu.boot.common.IBusinessProcessor;
import com.qiyu.boot.common.IBusinessType;
import com.qiyu.boot.processor.context.IContext;
import com.qiyu.boot.processor.result.IProcessResult;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qiyu
 * @date 2018/10/15
 */
public class DistributionProcessor implements IDistributionProcessor {

    @Resource
    private List<IBusinessProcessor> businessProcessorList;

    @Override
    public IProcessResult process(String context, IBusinessType businessType) throws ProcessException {
        return null;
    }

    @Override
    public IProcessResult process(IContext context, IBusinessType businessType) throws ProcessException {
        return null;
    }

    @Override
    public List<IBusinessProcessor> getBusinessProcessors(IBusinessType businessType) {
        if (businessProcessorList == null) {
            return null;
        }
        for (IBusinessProcessor businessProcessor : businessProcessorList) {
            if (businessProcessor.match(businessType)) {
                List<IBusinessProcessor> list =  new ArrayList<>();
                list.add(businessProcessor);
                return list;
            }
        }
        return null;
    }
}
