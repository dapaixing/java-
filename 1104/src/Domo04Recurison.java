import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Domo04Recurison {
    public static void main(String[] args) {
        File file = new File("C:\\C语言课件V3");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        //System.out.println(file);
//        File [] file1 = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//
//                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".pdf");
//            }
//        });
//        File [] file1 = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".pdf");
//            }
//        });
       // File [] file1 = file.listFiles((dir, name) -> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".pdf"));
        File [] file1 = file.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".pdf"));
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
