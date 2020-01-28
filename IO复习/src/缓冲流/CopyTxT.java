package 缓冲流;

import java.io.*;

public class CopyTxT {
    public static void main(String[] args) {

        copy("abc.txt","abcCopy.txt");

    }
    public static void copy(String srcPath,String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);

        try(BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {

           String line = null;
            while ((line = br.readLine())!=null){
                bw.append(line);
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
