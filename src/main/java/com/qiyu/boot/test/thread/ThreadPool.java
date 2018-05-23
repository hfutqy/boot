package com.qiyu.boot.test.thread;

import java.util.LinkedList;

/**
 * 创建一个线程池
 * Created by qiyu on 2018/5/23.
 */
public class ThreadPool {

    //线程池大小
    int threadPoolSize;

    //任务队列容器
    LinkedList<Runnable> tasks = new LinkedList<>();

    //试图消费任务的线程
    public ThreadPool(){
        threadPoolSize = 10;

        //启动threadPoolSize个消费者线程
        synchronized (tasks) {
            


        }

    }


}
