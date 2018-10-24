package com.qiyu.boot.aop;

import java.lang.reflect.Method;

/**
 * @author qiyu
 * @date 2018/10/24
 */
public interface InvocationHandler {

    public void invoke(Object o, Method method);

}
