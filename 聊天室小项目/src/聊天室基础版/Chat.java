package 聊天室基础版;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
在线聊天室
目标：实现一个客户可以正常首发信息

李兴磊；
QQ：2770587296
 */
public class Chat {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Server---------");
        ServerSocket server = new ServerSocket(9999);
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String datas = dis.readUTF();

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(datas);
        dos.flush();
        dos.close();
        dis.close();
        client.close();
    }
}
