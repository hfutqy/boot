package com.qiyu.boot.classloader;

import sun.misc.Resource;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;

/**
 * @author qiyu
 * @date 2018/11/1
 */
public class MyClassLoader extends ClassLoader {



    @Override
    public Class findClass(final String name) throws ClassNotFoundException {
        System.out.println("MyClassLoader to find class");

        return new Object().getClass();
    }

}
