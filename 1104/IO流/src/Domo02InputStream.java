import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Domo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:C语言课件V3\\b.txt");

        byte [] bytes =new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
    }
}
