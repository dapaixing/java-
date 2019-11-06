import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show02();
    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴","168");
        prop.setProperty("古力娜扎","165");
        prop.setProperty("马儿扎哈","170");

        FileWriter fw = new FileWriter("C:\\C语言课件V3\\g.txt");
        prop.store(fw,"save data");
        fw.close();
    }
}
