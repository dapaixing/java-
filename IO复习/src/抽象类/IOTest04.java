package 抽象类;

import java.io.*;

public class IOTest04 {
    public static void main(String[] args) {
        File src = new File("dext.txt");
        OutputStream os = null;

        try {
            os = new FileOutputStream(src,true);
            String msg = "IO is so easy\r\n";
            byte[] datas = msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null!=os) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
