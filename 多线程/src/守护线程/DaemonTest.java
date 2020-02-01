package 守护线程;

public class DaemonTest {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread t = new Thread(god);
        t.setDaemon(true);
        t.start();
        new Thread(you).start();
    }
}
class You extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 356 * 100; i++) {
            System.out.println("happy life...");
        }
        System.out.println("ooooooooo....");
    }
}
class God extends Thread{
    @Override
    public void run() {
        for (;true;) {
            System.out.println("bless you....");
        }
    }
}