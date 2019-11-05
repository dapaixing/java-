import java.util.Properties;
import java.util.Set;

public class Domo01Properties {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴","168");
        prop.setProperty("古力娜扎","165");
        prop.setProperty("马儿扎哈","170");

        Set<String> set = prop.stringPropertyNames();

        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"="+value );
        }
    }
}
