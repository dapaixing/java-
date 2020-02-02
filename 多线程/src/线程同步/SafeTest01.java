package 线程同步;

public class SafeTest01 {
    public static void main(String[] args) {
            SafeWeb12306 web = new SafeWeb12306();
            System.out.println(Thread.currentThread().getName());
            new Thread(web,"发").start();
            new Thread(web,"阿飞").start();
            new Thread(web,"安防").start();
    }
}

class SafeWeb12306 implements Runnable {
    private int tick = 1000;
    private boolean flag= true;
    @Override
    public void run() {
        while (flag){
            test();
        }
    }
    public synchronized void test(){
        if (tick <= 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->"+tick--);
    }
}
