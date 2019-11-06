import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo02Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("C:\\C语言课件V3\\g.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
