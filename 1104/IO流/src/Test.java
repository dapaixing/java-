import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("c:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\1.jpg");

//        int len = 0;
//        while ((len = fis.read())!= -1){
//            fos.write(len);
//        }

        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println((e-s)/1000.0);
    }
}
