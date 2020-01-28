package 缓冲流;

import java.io.*;

public class BufferedTest02 {
    public static void main(String[] args) {
        File dest = new File("dest.txt");
        OutputStream os = null;
        try {
            os = new BufferedOutputStream(new FileOutputStream(dest));
            String s = "IO is so easy";
            byte[] datas = s.getBytes();
            os.write(datas);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null!=os)
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
