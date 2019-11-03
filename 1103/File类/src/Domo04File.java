import java.io.File;

public class Domo04File {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src");
        String[] list1 = f1.list();
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
