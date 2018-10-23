package com.qiyu.boot.ztest;

/**
 * @author qiyu
 * @date 2018/10/23
 */
public class Main {
    public static void main(String[] args) {
//        int x = 2147483640;
        long x = 2147483647;
        double m = 0;
        for (long i = 0; i < x; i++) {
            int tmp = -1;
            if (i % 2 == 0) {
                tmp = 1;
            }
            m += (double) tmp / (2 * i + 1);
        }
        System.out.println(4 * m);
    }
}
