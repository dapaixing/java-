package URL;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class SpiderTest01 {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://www.jd.com");
        URL url = new URL("https://www.dianping.com");

        InputStream is = url.openStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

        String msg = null;
        while (null!=(msg = br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
