package com.qiyu.boot.qrcode;

import com.github.binarywang.utils.qrcode.QrcodeUtils;

import java.io.File;

/**
 * 二维码生成工具
 */
public class QRCodeUtil  {

    public static void main(String[] args) {
        File file = new File("xxxx");
        QrcodeUtils.createQrcode("Demo",10,file);


    }
}