import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReade {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\练习专用\\我是一个GBK文件.txt");
        int len = 0;
        while ((len = fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
