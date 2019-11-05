import java.io.FileWriter;
import java.io.IOException;

public class Domo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw  = new FileWriter("w:C语言课件V3\\f.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello World");
                fw.write("\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
