package 抽象类;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        copy("4.png","6.png");
    }
    public static void copy(String srcPath,String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas))!=-1){
                os.write(datas,0,datas.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=os)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (null!=is)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
