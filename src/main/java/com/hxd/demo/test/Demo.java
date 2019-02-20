package com.hxd.demo.test;

import com.hxd.demo.utils.QRCodeUtil;

public class Demo {

    public static void main(String[] args) {

        // 二维码信息  若为链接，可直接访问
        String message="https://www.cnblogs.com/xch-yang/p/5475869.html";
        //二维码存放路径
        String imgPath="C:\\Users\\Administrator\\Desktop";
        //创建二维码
        QRCodeUtil.createQRCode(message,imgPath);
    }

}
