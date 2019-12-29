package v2;

import v2.servlet.HttpServlet;
import v2.servlet.JokeJSServlet;
import v2.servlet.LoginServlet;

import java.net.Socket;

public class Task implements Runnable {
    private Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 读取并解析请求 -> 处理业务 -> 组装并发送响应

            // 1. 读取并解析请求
            Request request = Request.parse(socket.getInputStream());
            Response response = new Response();

            // 2. 处理业务
            HttpServlet servlet = new JokeJSServlet();
            if (request.path.equals("/joke.js")) {
                servlet.doGet(request, response);
            }else  if (request.path.equals("/login")){
                servlet = new LoginServlet();
                servlet.doGet(request,response);
            }

            // 3. 组装并发送响应
            response.writeAndFlush(socket.getOutputStream());
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
