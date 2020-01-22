package com.sxt.io;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File dir = new File("D:\\代码\\2020\\IO复习");
        String[] subNames = dir.list();
        for (String s : subNames) {
            System.out.println(s);
        }
        File[] subFiles = dir.listFiles();
        for (File s : subFiles) {
            System.out.println(s);
        }
    }
}
