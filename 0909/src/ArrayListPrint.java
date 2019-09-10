import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宋哈皮");
        list.add("麻瓜桑");
        list.add("憨憨中");
        list.add("舔狗帅");
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }
        }
        return;
    }
}
