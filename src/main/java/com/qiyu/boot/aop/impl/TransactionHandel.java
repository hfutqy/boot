package com.qiyu.boot.aop.impl;

import com.qiyu.boot.aop.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author qiyu
 * @date 2018/10/24
 */
public class TransactionHandel implements InvocationHandler {

    private Object target;

    public TransactionHandel(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method method) {
        System.out.println("事务开启。。。。。。");

    }
}
