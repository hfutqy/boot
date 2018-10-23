package com.qiyu.boot.aop;

/**
 * @author qiyu
 * @date 2018/10/23
 */
public interface BookService {

    static void bookInfo(){
        System.out.println("bookInfo book");
    }

    default void saleBook(){
        System.out.println("sale book");
    }

    void buyBook();

}


