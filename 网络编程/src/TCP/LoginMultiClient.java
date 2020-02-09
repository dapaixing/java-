//package TCP;
//
//import java.io.*;
//import java.net.Socket;
//
//public class LoginMultiClient {
//    public static void main(String[] args) throws IOException {
//        System.out.println("----------Client-----------");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("请输入用户名");
//        String uname = br.readLine();
//
//        System.out.println("请输入密码");
//        String upwd = br.readLine();
//
//        Socket client = new Socket("localhost",8888);
//
//        new Send(client).send("uname:"+uname+"&upwd:"+upwd);
//        new Receive(client).receive();
//
//        client.close();
//    }
//    static  class Send{
//        private Socket client;
//        private DataOutputStream dos;
//
//        public Send(Socket client) {
//            this.client = client;
//            try {
//                dos = new DataOutputStream(client.getOutputStream())
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        public void send(String msg){
//            try {
//                dos.writeUTF(msg);
//                dos.flush();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    static class Receive{
//        private DataInputStream dis;
//        private Socket client;
//
//        public Receive(Socket client) {
//            this.client = client;
//            try {
//                dis = new DataInputStream(client.getInputStream())
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        public void receive(){
//            String result = null;
//            try {
//                result = dis.readUTF();
//                System.out.println(result);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//}
