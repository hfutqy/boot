package com.qiyu.boot.ztest;

/**
 * @author qiyu
 * @date 2018/10/31
 */
public abstract class Demo implements Dee {
    private int a;

    public void get(){

    }

    public abstract void get(int a);

    public static int aa;

}


interface Dee{
    int a=1;
    int b=1;

    static int getA(){
        return 1;
    }
    int getB();





}