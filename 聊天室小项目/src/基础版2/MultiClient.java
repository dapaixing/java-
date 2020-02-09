package 基础版2;

import java.io.*;
import java.net.Socket;

public class MultiClient {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client----------");
        Socket client = new Socket("localhost",9999);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());

        boolean isRunning = true;
        while (isRunning) {
            String msg = console.readLine();
            dos.writeUTF(msg);
            dos.flush();

            String datas = dis.readUTF();
            System.out.println(datas);
        }
        dos.close();
        dis.close();
        client.close();

    }
}
