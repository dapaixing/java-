import javax.swing.tree.TreeNode;
import java.util.Scanner;

public class WaitDemo {
    private static Object object = new Object();
    public static void main(String[] args) {
        Thread a = new A();
        a.start();
        Scanner sc = new Scanner(System.in);
        System.out.println("我不输入，A线程就绝不会动");
        sc.nextLine();
        synchronized (object){
            object.notify();
        }
    }
    public static class A extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            synchronized (object){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }
    public static class B extends Thread{
        @Override
        public void run() {
            System.out.println("A执行完成");
        }
    }
}
