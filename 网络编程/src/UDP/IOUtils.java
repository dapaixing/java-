package UDP;

import java.io.*;

public class IOUtils {
    public static byte[] fileToByteArray(String filePath) {

        File file = new File(filePath);

        byte[] dest = null;

        InputStream is = null;

        ByteArrayOutputStream baos = null;


        try {
            is = new FileInputStream(file);
            baos = new ByteArrayOutputStream();

            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                baos.write(flush,0,len);
            }
            baos.flush();
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null!=is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void byteArrayToFile(byte[] src,String filePath) {
        File dest = new File(filePath);

        InputStream is = null;

        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);

            byte[] flush = new byte[5];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != os) {
                    os.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
