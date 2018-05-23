package com.qiyu.boot.test.thread;

/**
 * 启用线程池 测试类
 * Created by qiyu on 2018/5/23.
 */
public class TestThread {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();

        for (int i = 0; i < 5; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
                    //do anything
                }
            };

            pool.add(task);

            //这段是为了给线程池足够的初始化时间
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }

        }


    }

}
