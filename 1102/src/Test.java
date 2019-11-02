public class Test implements Runnable{
    private int num = 100;

    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName()+"正在卖第" + num + "张票");
                num--;
            }
        }
    }
}
