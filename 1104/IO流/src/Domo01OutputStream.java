import java.io.FileOutputStream;
import java.io.IOException;

public class Domo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:C语言课件V3\\a.txt");
        fos.write(97);
        fos.close();
    }
}
