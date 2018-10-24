package com.qiyu.boot.serializable;

import java.io.*;

/**
 * @author qiyu
 * @date 2018/10/24
 */
public class SerializableObject implements Serializable {

    private String str0="abcddddd";
    private transient String str1;
    private static String str2 = "abcddddd";

    public SerializableObject(String str0, String str1) {
        this.str0 = str0;
        this.str1 = str1;
    }

    public String getStr0() {
        return str0;
    }

    public String getStr1() {
        return str1;
    }

    public static String getStr2() {
        return str2;
    }
    //    private void writeObject(java.io.ObjectOutputStream s) throws Exception {
//        System.out.println("我想自己控制序列化的过程");
//        s.defaultWriteObject();
//        s.writeInt(str1.length());
//        for (int i = 0; i < str1.length(); i++)
//            s.writeChar(str1.charAt(i));
//    }
//
//    private void readObject(java.io.ObjectInputStream s) throws Exception {
//        System.out.println("我想自己控制反序列化的过程");
//        s.defaultReadObject();
//        int length = s.readInt();
//        char[] cs = new char[length];
//        for (int i = 0; i < length; i++)
//            cs[i] = s.readChar();
//        str1 = new String(cs, 0, length);
//    }

    public static void main(String[] args) throws Exception {
        File file = new File("D:" + File.separator + "s.txt");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(new SerializableObject("str011", "str1"));
        oos.close();

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        SerializableObject so = (SerializableObject) ois.readObject();
        System.out.println("str0 = " + so.getStr0());
        System.out.println("str1 = " + so.getStr1());
        System.out.println("str2 = " + SerializableObject.getStr2());
        ois.close();
    }

}
