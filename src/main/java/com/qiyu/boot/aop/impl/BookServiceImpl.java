package com.qiyu.boot.aop.impl;

import com.qiyu.boot.aop.BookService;

/**
 * @author qiyu
 * @date 2018/10/23
 */
public class BookServiceImpl implements BookService {

    @Override
    public void buyBook() {
        System.out.println("买书。。。");
    }


}
