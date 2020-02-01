package 线程同步;

public class UnsafeTest01 {
    public static void main(String[] args) {
            Web12306 web = new Web12306();
            System.out.println(Thread.currentThread().getName());
            new Thread(web,"发").start();
            new Thread(web,"阿飞").start();
            new Thread(web,"安防").start();
    }
}
class Web12306 implements Runnable {
    private int tick = 10;
    private boolean flag= true;
    @Override
    public void run() {
        while (flag){
            test();
        }
    }
    public  void test(){
        if (tick < 0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->"+tick--);
    }
}
