package 抽象类;

import java.io.*;

public class IOTest10 {
    public static void main(String[] args) {
        byte[] bytes = fileToByteArray("4.png");
        System.out.println(bytes.length);
        byteArrayToFile(bytes,"7.png");
    }
    public static byte[] fileToByteArray(String filePath){
        File src = new File(filePath);
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            byte[] flush = new byte[1024*10];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                baos.write(flush,0,len);
            }
            baos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null!=is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return baos.toByteArray();
    }
    public static void byteArrayToFile(byte[] src,String filePath){
        File dest = new File(filePath);
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);

            byte[] datas = new byte[5];
            int len = -1;
            while ((len = is.read(datas))!=-1){
                os .write(datas,0,len);
            }
            os.flush();
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
