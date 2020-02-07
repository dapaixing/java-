package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpFileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中。。");

        DatagramSocket client = new DatagramSocket(8888);

        byte[] datas = IOUtils.fileToByteArray("src/4.png");

        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",9999));
        client.send(packet);
        client.close();
    }
}
