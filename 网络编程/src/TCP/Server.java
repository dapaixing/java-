package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Server--------");
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket client = serverSocket.accept();

        System.out.println("一个客户端建立了连接");
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        System.out.println(data);

        dis.close();
        client.close();
    }
}
