package com.sxt.io;

import java.io.UnsupportedEncodingException;

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命";

        byte[] datas = msg.getBytes();
//        System.out.println(datas.length);
//
//        datas = msg.getBytes("UTF-16LE");
//        System.out.println(datas.length);
//        datas = msg.getBytes("GBK");
//        System.out.println(datas.length);
        msg = new String(datas,0,datas.length,"UTF-8");
        System.out.println(msg);
    }
}
