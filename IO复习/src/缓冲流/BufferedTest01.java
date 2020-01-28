package 缓冲流;

import com.sxt.io.FileDemo02;

import java.io.*;

public class BufferedTest01 {
    public static void main(String[] args) {
        File src = new File("abc.txt");

        InputStream is = null;

        try {
            is = new BufferedInputStream(new FileInputStream(src));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                String str = new String(flush, 0, len);
                System.out.printf(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=is)
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
