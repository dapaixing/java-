package 抽象类;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        File src = new File("abc.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            int temp;
//            int data1 = is.read();
//            int data2 = is.read();
//            int data3 = is.read();
//            System.out.println((char) data1);
//            System.out.println((char) data2);
//
//            System.out.println((char) data3);
            while ((temp = is.read())!=-1){
                System.out.println((char)temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
