import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\练习专用\\p.txt");
        ps.write(97);
        ps.println("HelloWorld");
        ps.close();
    }
}
