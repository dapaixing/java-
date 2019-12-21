package 网络;

import javax.xml.ws.Service;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer {
    private static class ServiceTask implements Runnable{
        private final Socket socket;
        private ServiceTask(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                Reader reader = new InputStreamReader(is, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(reader);

                Writer writer = new OutputStreamWriter(os, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String message;
                //等待客户端发送数据
                while ((message = bufferedReader.readLine()) != null) {
                    System.out.println("我收到一条消息：" + message);
                    printWriter.println(message);
                    printWriter.flush();
                }
                socket.close();
            }catch (IOException e){}
        }
    }
    public static void main(String[] args) throws IOException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            //先等待客户端建立连接了
            Socket socket = serverSocket.accept();//阻塞，时间沧海桑田
            //有客户端建立连接了
            pool.execute(new ServiceTask(socket));

        }
    }
}
