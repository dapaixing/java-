import java.io.FileWriter;
import java.io.IOException;

public class Domo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:C语言课件V3\\d.txt");
        fw.write(97);
        fw.close();
    }
}
