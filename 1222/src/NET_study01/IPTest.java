package NET_study01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        addr = InetAddress.getByName("www.shsxt.com");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

    }
}
