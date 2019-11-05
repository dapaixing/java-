import java.io.FileWriter;
import java.io.IOException;

public class Domo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw  = new FileWriter("C:C语言课件V3\\f.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("Hello World");
            fw.write("\r\n");
        }
        fw.close();
    }
}
