import java.io.File;

public class Domo02File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        File f2 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile.java");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }

    private static void show01() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src");
        System.out.println(f1.exists());
        File f2 = new File("D:\\代码\\JAVA\\1103\\File类\\s");
        System.out.println(f2.exists());
        File f3 = new File("1103.iml");
        System.out.println(f3.exists());

        File f4 = new File("a.txt");
        System.out.println(f4.exists());
    }
}
