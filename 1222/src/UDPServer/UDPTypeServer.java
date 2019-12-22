package UDPServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPTypeServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动中");

        DatagramSocket server = new DatagramSocket(8888);
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);

        server.receive(packet);
        byte[] datas = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(datas,0,len));

        server.close();
    }
}
