package 龟兔赛跑;

public class Web12306 implements Runnable {
    private int tick = 99;
    @Override
    public void run() {
        while (true){
            if (tick < 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---->"+tick--);
        }
    }

    public static void main(String[] args) {
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        new Thread(web,"发").start();
        new Thread(web,"阿飞").start();
        new Thread(web,"安防").start();

    }
}
