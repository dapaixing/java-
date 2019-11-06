import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\C语言课件V3\\g2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("我把数据写到内部缓冲区中".getBytes());

        bos.flush();
        bos.close();
    }
}
