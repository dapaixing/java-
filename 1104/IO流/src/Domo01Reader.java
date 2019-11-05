import java.io.FileReader;
import java.io.IOException;

public class Domo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:C语言课件V3\\c.txt");
        int len = 0;
        while ((len = fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
