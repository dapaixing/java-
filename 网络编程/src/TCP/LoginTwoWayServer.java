package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginTwoWayServer {
    public static void main(String[] args) throws IOException {
        System.out.println("------------Server-----------");
        ServerSocket server = new ServerSocket(8888);

        Socket client = server.accept();

        System.out.println("一个客户端建立了连接");

        DataInputStream dis = new DataInputStream(client.getInputStream());

        String datas = dis.readUTF();
        String uname = "";
        String upwd = "";
        String[] dataArray = datas.split("&");
        for (String info : dataArray) {
            String[] userInfo = info.split(":");
            if (userInfo[0].equals("uname")){
                System.out.println("你的用户名："+userInfo[1]);
                uname = userInfo[1];
            }else if (userInfo[0].equals("upwd")){
                System.out.println("你的密码为："+userInfo[1]);
                upwd = userInfo[1];
            }
        }
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        if (uname.equals("shsxt")&&upwd.equals("123456")){
            dos.writeUTF("登录成功，欢迎回来");
        }else {
            System.out.println("用户名或密码错误");
            dos.writeUTF("用户名或密码错误");
        }
        dos.close();
        dis.close();
        client.close();
    }
}
