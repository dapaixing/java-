package HTTP;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Request {
    //方法
    String mathod;
    //路径
    String path;
    //版本
    String version;

    Map<String,String> headers = new HashMap<>();
    public static Request parse(InputStream is){
        Request request = new Request();
        Scanner scanner = new Scanner(is,"UTF-8");

        parsreRequestLine(request,scanner.nextLine());
        String line;
        while (!(line = scanner.nextLine()).isEmpty()){
            String[] group = line.split(":");
            String key = group[0].trim();
            String value = group[1].trim();
            request.headers.put(key,value);
        }
        return request;
    }

    private static void parsreRequestLine(Request request, String line) {
        String[] group = line.split(" ");
        request.mathod = group[0];
        request.path = group[1];
        request.version = group[2];
    }

    @Override
    public String toString() {
        return "Request{" +
                "mathod='" + mathod + '\'' +
                ", path='" + path + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                '}';
    }
}
