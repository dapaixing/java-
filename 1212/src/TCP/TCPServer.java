package TCP;

import com.sun.corba.se.spi.activation.Server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        File file = new File("D:\\upload");

        if (!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        socket.getOutputStream().write("上传成功".getBytes());

        fos.close();
        socket.close();
        server.close();

    }
}
