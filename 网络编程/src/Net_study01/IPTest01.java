package Net_study01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        addr = InetAddress.getByName("www.baidu.com");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
