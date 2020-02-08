package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Server--------");
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket client = serverSocket.accept();

        System.out.println("一个客户端建立了连接");

        InputStream is = new BufferedInputStream(client.getInputStream());
        OutputStream os = new BufferedOutputStream(new FileOutputStream("src/tcp.png"));
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len = is.read(flush))!=-1){
            os.write(flush,0,len);
        }
        os.close();
        is.close();
        client.close();
    }
}
