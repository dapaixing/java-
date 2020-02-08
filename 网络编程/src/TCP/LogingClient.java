package TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class LogingClient {
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
        dos.close();
        client.close();
    }
}
