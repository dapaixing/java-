package 缓冲流;

import java.io.*;

public class BufferedTest04 {
    public static void main(String[] args) {
        File file = new File("d.txt");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.append("IO is so easy!");
            bufferedWriter.newLine();
            bufferedWriter.append("飒飒开发了");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=bufferedWriter)
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
