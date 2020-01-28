package 缓冲流;

import java.io.*;

public class BufferedTest03 {
    public static void main(String[] args) {
        File dest = new File("abc.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(dest));
            String line = null;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader!=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
