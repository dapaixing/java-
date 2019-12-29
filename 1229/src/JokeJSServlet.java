public class JokeJSServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) {
        resp.setStatus("2" +
                "00 OK");
        resp.setHeader("Content-Type", "application/javascript; charset=utf-8");
        resp.println("alert('很好很好');");
    }
}
