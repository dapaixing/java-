package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpFileServer {
    public static void main(String[] args) throws IOException {
        System.out.println("接收方启动中。。。");

        DatagramSocket server = new DatagramSocket(9999);

        byte[] bytes = new byte[1024 * 60];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        server.receive(packet);

        byte[] datas = packet.getData();
        int len = packet.getLength();
        IOUtils.byteArrayToFile(datas,"src/copy.png");

        server.close();
    }
}
