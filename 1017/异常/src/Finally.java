import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        try {//可能会产生异常的代码
            readFile("c:\\a.tx");
        } catch (IOException e) {
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            //无论如何都需要执行的代码
            System.out.println("资源释放");
        }

    }
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名错误");
        }
        System.out.println("路径正确读取文件");
    }
}
