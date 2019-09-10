import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("====================");
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("=====================");
        for (Map.Entry<String,String> e : map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
