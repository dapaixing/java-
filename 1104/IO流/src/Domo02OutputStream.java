import java.io.FileOutputStream;
import java.io.IOException;

public class Domo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:C语言课件V3\\b.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte [] bytes = {65,66,67,68,69};
        fos.write(bytes);
        byte [] bytes2 = {-65,-66,-67,68,69};
        fos.write(bytes2);
        byte [] bytes3 = {-65,-66,-67,68,69};
        fos.write(bytes3,1,2);
        fos.close();
    }
}
