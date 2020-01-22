package com.sxt.io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File src  = new File("D:\\代码\\2020\\IO复习\\io.txt");
        boolean newFile = src.createNewFile();
        System.out.println(newFile);
        boolean delete = src.delete();
        System.out.println(delete);
        System.out.println("------------");

        src = new File("D:\\代码\\2020\\IO复习01");
        boolean newFile1 = src.createNewFile();
        System.out.println(newFile1);
        delete = src.delete();
        System.out.println(delete);
    }
}
