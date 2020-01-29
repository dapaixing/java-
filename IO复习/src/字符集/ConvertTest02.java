package 字符集;

import java.io.*;
import java.net.URL;

public class ConvertTest02 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader( new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"UTF-8"))) {
            String mas;
            while ((mas = reader.readLine())!=null){
                //System.out.print((char)temp);
                writer.write(mas);
                writer.newLine();
            }
            writer.flush();
        }catch (IOException e){
            System.out.println("操作异常");
        }

    }
}
