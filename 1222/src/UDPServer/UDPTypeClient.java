package UDPServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPTypeClient {
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中。。。。");
        DatagramSocket client = new DatagramSocket(9999);

        byte[] datas = data.getBytes();

        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",8888));

        client.send(packet);

        client.close();
    }
}
