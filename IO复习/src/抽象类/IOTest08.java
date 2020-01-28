package 抽象类;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest08 {
    public static void main(String[] args) {
        byte[] datas = "asdfghj".getBytes();
        InputStream is = null;
        try {
            is = new ByteArrayInputStream(datas);
            byte[] flush = new byte[5];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                String s = new String(flush, 0, len);
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
