package udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpClientSocket = new DatagramSocket();
        String message = "我是张玉玉？";
        byte [] sendBuffer = message.getBytes("UTF-8");
        byte[] serverIP = new byte[4];
        serverIP[0] = (byte)127;
        serverIP[1] = (byte)0;
        serverIP[2] = (byte)0;
        serverIP[3] = (byte)1;
        InetAddress serverAddress = InetAddress.getByAddress(serverIP);
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                serverAddress,
                9898
        );
        udpClientSocket.send(sendPacket);

        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(
                receiveBuffer,
                receiveBuffer.length
        );
        udpClientSocket.receive(receivePacket);
        String s = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
        System.out.println(s);

        udpClientSocket.close();
    }
}
