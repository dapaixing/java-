package com.sxt.io;

import java.io.File;

public class PathDemo01 {
    public static void main(String[] args) {
        File src = new File("IO复习");
        System.out.println(src.getName());
        System.out.println(src.getPath());
        System.out.println(src.getAbsolutePath());
    }
}
