import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream ps = new PrintStream("C:\\练习专用\\p2.txt");
        System.setOut(ps);
        System.out.println("我在打印流的目的地输出");
    }
}
