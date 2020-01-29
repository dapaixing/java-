package 字符集;

import java.io.*;

public class ConvertTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String masg = "";
            while (!masg.equals("exit")){
                masg = reader.readLine();
                writer.write(masg);
                writer.newLine();
                writer.flush();
            }
        }catch (IOException e){
            System.out.println("操作异常");
        }

    }
}
