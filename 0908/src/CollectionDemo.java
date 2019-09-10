import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("=============================");
        list.add("我");
        list.add("爱");
        list.add("java");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for (String e : list) {
            System.out.println(e);
        }
        list.remove("爱");
        for (String e : list) {
            System.out.println(e);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
