package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LogingServer {
    public static void main(String[] args) throws IOException {
        System.out.println("------------Server-----------");
        ServerSocket server = new ServerSocket(8888);

        Socket client = server.accept();

        System.out.println("一个客户端建立了连接");

        DataInputStream dis = new DataInputStream(client.getInputStream());

        String datas = dis.readUTF();
        String[] dataArray = datas.split("&");
        for (String info : dataArray) {
            String[] userInfo = info.split(":");
            if (userInfo[0].equals("uname")){
                System.out.println("你的用户名为："+userInfo[1]);
            }else if (userInfo[0].equals("upwd")){
                System.out.println("你的密码为："+userInfo[1]);
            }
        }
        dis.close();
        client.close();
    }
}
