import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
//            System.out.println("传递的文件后缀不是.txt");
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名错误");
        }
        System.out.println("路径正确读取文件");
    }
}
