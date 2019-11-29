import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\C语言课件V3\\测试目录\\a.txt");
        file.createNewFile();
        OutputStream os = new FileOutputStream(file);
        
//        file.createNewFile();
//        OutputStream os = new FileOutputStream(file);
//        os.write(97);
//        os.write(98);
//        os.write(99);

//        File file = new File("c:");
//        Print2(file);
//
//        File file = new File("C:\\C语言课件V3");
//        Print(file);
//        File file = new File("C:\\C语言课件V3\\测试目录");
//        System.out.println(file.isHidden());
//        System.out.println(file.length());
//        File file = new File("C:\\C语言课件V3\\测试目录");
//        File [] f = file.listFiles();
//        for (File file1 : f) {
//            System.out.println(file1);
//        }
//        File file = new File("C:\\C语言课件V3\\测试目录","1\\2\\3\\a1.txt");
//        file.mkdirs();
//        file.createNewFile();
//        file.delete();
//        File file = new File("C:\\C语言课件V3\\测试目录");
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getUsableSpace());
//        System.out.println(file.getTotalSpace());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getParent());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
    }
    static File[] list = new File[10000];
    static int i = 0;
    private static void Print(File file){
        if (file.isDirectory()){
            File [] files = file.listFiles();
            if (files != null){
                for (File file1 : files) {
                    Print(file1);
                }
            }
        }
        else {
            System.out.println(file);
        }
    }
    private static void Print2(File file){
        if (file.isDirectory()){
            File [] files = file.listFiles();
            if (files != null){
                for (File file1 : files) {
                    Print(file1);
                }
            }
        }
        else {
            list[i] = file;
        }
    }
}
