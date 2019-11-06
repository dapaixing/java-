import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\练习专用\\utf_8.txt"),"utf-8");
//
//        int len = 0;
//        while ((len = isr.read())!=-1){
//            System.out.println((char) len);
//        }
//        isr.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\练习专用\\gbk.txt"),"gbk");
        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
