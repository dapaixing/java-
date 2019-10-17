import javax.security.auth.login.FailedLoginException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
    }
    public static void readFile(String fileName) throws IOException {
//        if (!fileName.equals("c:\\a.txt")){
//            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
//        }
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名错误");
        }
        System.out.println("路径正确读取文件");
    }
}
