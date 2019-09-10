import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C语言");
        courses.add("java SE");
        System.out.println(courses);
        System.out.println(courses.get(1));
        courses.set(0,"计算机基础");
        System.out.println(courses);

        List<String> sub = courses.subList(1,3);
        System.out.println(sub);
        List<String> list = new ArrayList<>(10);
        list.get(9);
    }
}
