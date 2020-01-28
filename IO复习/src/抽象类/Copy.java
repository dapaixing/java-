package 抽象类;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        copy("4.png","6.png");
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
    public static void copy(String srcPath,String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);

        try(InputStream is = new BufferedInputStream(new FileInputStream(src));
            OutputStream os = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas))!=-1){
                os.write(datas,0,datas.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
