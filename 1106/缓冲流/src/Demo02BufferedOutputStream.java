import java.io.*;

public class Demo02BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\C语言课件V3\\g2.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

//        int len = 0;
//        while ((len = bis.read())!= -1){
//            System.out.println(len);
//        }
        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
