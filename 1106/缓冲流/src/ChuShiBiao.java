import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class ChuShiBiao {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\C语言课件V3\\chu.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\C语言课件V3\\chu2.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }

        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
