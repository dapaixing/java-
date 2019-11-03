import java.io.File;

public class DomoFile {
    public static void main(String[] args) {
//        show01();
//        show02();
        //show03();
        show04();

    }

    private static void show04() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile.java");
        long l1 = f1.length();
        System.out.println(l1);
        File f2 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile1.java");
        long l2 = f2.length();
        System.out.println(l2);
        File f3 = new File("D:\\代码\\JAVA\\1103\\File类\\src");
        long l3 = f3.length();
        System.out.println(l3);

    }

    private static void show03() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile.java");
        String name1 = f1.getName();
        System.out.println(name1);
        File f2 = new File("D:\\代码\\JAVA\\1103\\File类\\src");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    private static void show02() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile.java");
        String s1 = f1.getPath();
        System.out.println(s1);
        File f2 = new File("DomoFile.java");
        String s2 = f2.getPath();
        System.out.println(s2);
        System.out.println(f1);
        System.out.println(f1.toString());
    }

    private static void show01() {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\DomoFile.txt");
        String s = f1.getAbsolutePath();
        System.out.println(s);
        File f2 = new File("DomoFile.java");
        String s1 = f2.getAbsolutePath();
        System.out.println(s1);
    }
}
