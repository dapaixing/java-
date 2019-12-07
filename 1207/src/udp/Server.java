package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpServerSocket = new DatagramSocket(9898);
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        udpServerSocket.receive(receivePacket);
        InetAddress clientAddress = receivePacket.getAddress();
        System.out.printf("我从%s:%d 收到了消息",
                            clientAddress.getHostAddress(),
                            receivePacket.getPort());
        System.out.printf("我一共收到了%d字节的数据", receivePacket.getLength());

        String message = new String(receivePacket.getData(),
                                    0,
                                    receivePacket.getLength(),
                                    "UTF-8");
        System.out.println();
        System.out.println(message);

        byte[] sendBuffer = message.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                clientAddress,
                receivePacket.getPort()
        );
        udpServerSocket.send(sendPacket);
        udpServerSocket.close();
    }
}

