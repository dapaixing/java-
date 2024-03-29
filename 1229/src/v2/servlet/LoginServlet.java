package v2.servlet;

import v2.Request;
import v2.Response;

import java.io.IOException;

public class LoginServlet extends HttpServlet {


    @Override
    public void doGet(Request req, Response resp) throws IOException {
        String username = req.parameters.get("username");
        if (username == null){
            resp.setStatus("401 Unauthorized");
            resp.println("<h1>请登录</h1>");
            return;
        }
        resp.setHeader("Set-Cookie","username=" + username);
        resp.print("<h1>欢迎"+username+"光临</h1>");
    }

}
