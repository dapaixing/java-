import java.io.File;
import java.io.IOException;

public class Domo03File {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        File f2 = new File("File类\\02.txt");
        boolean b2 = f2.delete();
        System.out.println(b2);

    }

    private static void show02() {
        File f1 = new File("File类\\03");
        boolean b1 = f1.mkdir();
        System.out.println(b1);
        File f2 = new File("File类\\111\\222\\333");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);
    }

    private static void show01() throws IOException {
        File f1 = new File("D:\\代码\\JAVA\\1103\\File类\\src\\1.txt");
        boolean newFile1 = f1.createNewFile();
        System.out.println(newFile1 );
        File f2 = new File("File类\\02.txt");
        boolean newFile2 = f2.createNewFile();
        System.out.println(newFile2);
    }
}
