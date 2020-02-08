package TCP;

import java.io.*;
import java.net.Socket;

public class LoginMultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client-----------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名");
        String uname = br.readLine();

        System.out.println("请输入密码");
        String upwd = br.readLine();

        Socket client = new Socket("localhost",8888);

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        dos.writeUTF("uname:"+uname+"&upwd:"+upwd);
        dos.flush();

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String result = dis.readUTF();
        System.out.println(result);
        dos.close();
        client.close();
    }
}
