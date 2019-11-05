import java.io.FileWriter;
import java.io.IOException;

public class Domo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw  = new FileWriter("C:C语言课件V3\\f.txt");
        char [] cs = {'a','b','c','d','e'};
        fw.write(cs);
        fw.write(cs,1,2);
        fw.write("张玉玉是憨憨");
        fw.close();
    }
}
