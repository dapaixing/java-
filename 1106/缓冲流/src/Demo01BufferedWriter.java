import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\C语言课件V3\\g3.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("艾佛批发商");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
