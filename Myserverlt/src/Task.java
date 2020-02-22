import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Task implements Runnable{
    private final Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            Request request = Request.parse(is);
            System.out.println(request);
            Response response = new Response();

            if (request.path.equals("/joke.js")){
                HttpServerlet serverlet = new JokeJSServlet();
                serverlet.doGet(request,response);
            }else {
                response.setStatus("404 Not Found");
                response.setHeader("Content-Type","text/html; charset=utf-8");
                response.println("<h1>没有找到页面</h1>");
            }
            response.writeAndFlush(os);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
