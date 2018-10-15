package com.qiyu.boot.processor;

import com.qiyu.boot.common.BusinessType;
import com.qiyu.boot.common.IBusinessProcessor;
import com.qiyu.boot.common.IBusinessType;
import com.qiyu.boot.processor.context.Context;
import com.qiyu.boot.processor.result.ProcessResult;

/**
 * @author qiyu
 * @date 2018/10/15
 */
public class SelectProcessor implements IBusinessProcessor<Context, ProcessResult> {
    @Override
    public boolean match(IBusinessType businessType) {
        return BusinessType.SELECT.equals(businessType);
    }

    @Override
    public ProcessResult process(Context context) {
        return new ProcessResult(true, "SELECT成功");
    }
}