import java.io.*;

public class Demo01BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\C语言课件V3\\g3.txt"));

//        String l1 = br.readLine();
//        System.out.println(l1);
        String l2;
        while ((l2 = br.readLine())!= null){
            System.out.println(l2);
        }
        br.close();
    }
}
