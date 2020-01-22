package com.sxt.io;

import java.io.File;

public class PrintDir {
    public static void main(String[] args) {
        File src = new File("D:\\代码\\2020\\IO复习");
        printName(src,0);
    }
    public static void printName(File n,int deep){
        for (int i = 0; i < deep; i++) {
            System.out.print('-');
        }
        System.out.println(n.getName());
        if (null == n||!n.exists()){
            return;
        }else if (n.isDirectory()){
            for (File s : n.listFiles()) {
                printName(s,deep+1);
            }
        }
    }
}
