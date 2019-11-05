import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Domo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:C语言课件V3\\a.txt");

        int len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        fis.close();
    }
}
