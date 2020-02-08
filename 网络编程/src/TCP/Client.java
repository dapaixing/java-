package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("----------Client--------");
        Socket client = new Socket("localhost",9999);

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        String data = "hello";
        dos.writeUTF(data);
        dos.flush();
        dos.close();
        client.close();
    }
}
