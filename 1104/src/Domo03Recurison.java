import java.io.File;
import java.util.Objects;

public class Domo03Recurison {
    public static void main(String[] args) {
        File file = new File("C:\\C语言课件V3");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        //System.out.println(file);
        File [] file1 = file.listFiles(new FileFilterImpl());
        for (File file2 : file1) {
            if (file2.isDirectory()){
                getAllFile(file2);
            }
            else {
                System.out.println(file2);
            }
        }
    }
}
