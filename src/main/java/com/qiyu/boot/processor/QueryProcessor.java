package com.qiyu.boot.processor;

import com.qiyu.boot.common.BusinessType;
import com.qiyu.boot.common.IBusinessProcessor;
import com.qiyu.boot.common.IBusinessType;
import com.qiyu.boot.processor.context.Context;
import com.qiyu.boot.processor.result.ProcessResult;
import org.springframework.stereotype.Component;

/**
 * @author qiyu
 * @date 2018/10/15
 */
@Component
public class QueryProcessor implements IBusinessProcessor<Context, ProcessResult>{
    @Override
    public boolean match(IBusinessType businessType) {
        return BusinessType.QUERY.equals(businessType);
    }

    @Override
    public ProcessResult process(Context context) {
        return new ProcessResult(true, "查询成功");
    }
}
