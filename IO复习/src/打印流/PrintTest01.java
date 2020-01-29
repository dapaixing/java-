package 打印流;

import java.io.*;

public class PrintTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = System.out;
        ps.println("打印流");
        ps.println(true);

        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")));
        ps.println("打印流");
        ps.println(true);
        ps.close();

        System.setOut(ps);
        System.out.println("change");
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))));
        System.out.println("I am backing...");
    }
}
