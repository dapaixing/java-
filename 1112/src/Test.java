import javax.naming.NameNotFoundException;

public class Test {
    private static int n = 0;
    private static Object object = new Object();
    public static void main(String[] args) {
        Thread a = new A();
        Thread b = new B();
        a.start();
        b.start();
    }
    public static class A extends Thread{
        @Override
        public void run() {
            while (true){
                synchronized (object) {
                    if (n == 10){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    n++;
                    System.out.println(getName() + ":" +n);

                    object.notify();

                }
            }
        }
    }
    public static class B extends Thread{
        @Override
        public void run() {
            while (true) {
                synchronized (object) {
                    if (n == 0) {
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    n--;
                    System.out.println(getName() + ":" + n);

                    object.notify();

                }
            }
        }
    }
}
