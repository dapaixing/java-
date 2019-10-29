package xin;

public class RunnableImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            Object object = new Object();
            synchronized (object) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
