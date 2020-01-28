package 抽象类;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;

public class IOTest09 {
    public static void main(String[] args) {
        byte[] dest = null;

        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();

            String str = "show me fs f";
            byte[] datas = str.getBytes();
            baos.write(datas,0,datas.length);
            baos.flush();
            dest = baos.toByteArray();
            System.out.println(dest.length);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
