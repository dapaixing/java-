package com.sxt.io;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File src = new File("D:\\代码\\2020\\IO复习\\io01");
        boolean mkdir = src.mkdir();
        System.out.println(mkdir);


    }
}
