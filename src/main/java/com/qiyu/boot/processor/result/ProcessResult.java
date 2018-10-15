package com.qiyu.boot.processor.result;

/**
 * Created by qiyu on 2018/10/15.
 * @author qiyu
 */
public class ProcessResult implements IProcessResult {

    /**
     * 成功或失败
     */
    private boolean success;

    /**
     * 备注
     */
    private String remark;

    public ProcessResult(boolean success) {
        this.success = success;
    }

    public ProcessResult(boolean success, String remark) {
        this.success = success;
        this.remark = remark;
    }

    @Override
    public boolean isSuccess() {
        return this.success;
    }

    @Override
    public String getRemark() {
        return this.remark;
    }
}
