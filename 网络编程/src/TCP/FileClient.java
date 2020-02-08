package TCP;

import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client--------");
        Socket client = new Socket("localhost",9999);

        InputStream is = new BufferedInputStream(new FileInputStream("src/4.png"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream());
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = is.read(flush))!=-1){
            os.write(flush,0,len);
        }
        os.flush();
        os.close();
        is.close();
        client.close();
    }
}
