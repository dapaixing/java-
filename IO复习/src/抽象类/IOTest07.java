package 抽象类;

import java.io.*;

public class IOTest07 {
    public static void main(String[] args) {
        File dest = new File("dest.txt");
        Writer writer = null;
        try {
           writer = new FileWriter(dest);
//            String msg = "IO is so easy\r\n广东省哇";
//            char[] datas = msg.toCharArray();
//            writer.write(datas,0,datas.length);
//            writer.flush();
//            String msg = "IO is so easy\r\n广东省哇";
//            writer.write(msg);
//            writer.flush();
            writer.append("IO is so easy\r\n").append("广东省哇");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null!=writer) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
