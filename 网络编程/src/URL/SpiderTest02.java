package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SpiderTest02 {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://www.jd.com");
        URL url = new URL("https://www.dianping.com");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));

        String msg = null;
        while (null!=(msg = br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
