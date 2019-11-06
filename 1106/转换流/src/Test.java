import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\练习专用\\我是一个GBK文件.txt"),"GBK");
        OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream("C:\\练习专用\\我是一个utf_8文件.txt"),"utf-8");
        int len = 0;
        while ((len = isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
