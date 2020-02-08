package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpTalkServer {
    public static void main(String[] args) throws Exception {
        System.out.println("接收方启动中。。。");

        DatagramSocket server = new DatagramSocket(9999);

        while (true) {
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);

            server.receive(packet);

            byte[] datas = packet.getData();
            int length = packet.getLength();
            String data = new String(datas, 0, length);
            System.out.println(data);
            if (data.equals("bye")){
                break;
            }
        }
        server.close();
    }
}
