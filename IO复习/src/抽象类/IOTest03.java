package 抽象类;



import java.io.*;

public class IOTest03 {
    public static void main(String[] args) {
        File src = new File("abc.txt");
        InputStream is = null;

        try {
            is = new FileInputStream(src);
            byte[] flush = new byte[3];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                String string = new String(flush, 0, len);
                System.out.println(string);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
