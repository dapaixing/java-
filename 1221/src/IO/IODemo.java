package IO;

import java.io.*;
import java.net.Socket;

public class IODemo {

    private static InputStream 这是一个本地文件() throws FileNotFoundException {
        InputStream inputStream;
        inputStream = new FileInputStream("本地文件.txt");

        return inputStream;
    }
    private static String 从字节流中最终获得的字符数据(InputStream is) throws IOException {
//        byte[] buffer = new byte[1024];
//        int len = is.read(buffer);
//        String message = new String(buffer,0,len,"UTF-8");
//        return message;

//        Reader reader = new InputStreamReader(is,"UTF-8");
//        char[] buffer = new char[1024];
//        int len = reader.read(buffer);
//        String message = new String(buffer,0,len);
//        return message;

//        StringBuilder sb = new StringBuilder();
//        Reader reader = new InputStreamReader(is,"UTF-8");
//        char[] buffer = new char[10];
//        int len ;
//        while ((len = reader.read(buffer))!=-1){
//            sb.append(buffer,0,len);
//        }
//        String message = sb.toString();
//        return message;

        Reader reader = new InputStreamReader(is,"UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = bufferedReader.readLine())!=null){
            sb.append(line+"\r\n");
        }
        return sb.toString();
    }

    private static InputStream 获取一个输入流() throws IOException {
        InputStream inputStream;
//        byte[] bytes = "我只是内存中的一段空间\r\n第二行\r\n".getBytes();
//        inputStream = new ByteArrayInputStream(bytes);
        Socket socket = new Socket("www.baidu.com",80);
        OutputStream os = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(os,"UTF-8");
        PrintWriter printWriter = new PrintWriter(writer,false);
        printWriter.printf("GET / HTTP/1,0\r\n\r\n");
        printWriter.flush();
        inputStream = socket.getInputStream();
        return inputStream;
    }
    private static OutputStream 获取一个输出流() throws FileNotFoundException {
        OutputStream os = new FileOutputStream("本地输出文件.txt");
//        Socket socket = new Socket("www.baidu.com",80);
//        OutputStream os = socket.getOutputStream();
//        OutputStream os = new ByteArrayOutputStream();
        return os;
    }
    private static void 输出一段字符(OutputStream os,String message) throws IOException {
        byte[] buffer = message.getBytes("UTF-8");
        os.write(buffer);
        os.flush();
    }
    public static void main(String[] args) throws IOException {
//        InputStream is = 这是一个本地文件();
//        InputStream is = 获取一个输入流();
//        String s = 从字节流中最终获得的字符数据(is);
//        System.out.println(s);
        OutputStream os = 获取一个输出流();
        输出一段字符(os,"我是一个中国人，最喜欢过年了\r\n");
    }
}
