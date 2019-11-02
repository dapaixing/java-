public class Test1 extends Thread {
    @Override
    public void run() {
        long num = 0;
        for (int i = 0; i <= 1000000; i++) {
            num += i;
        }
        System.out.println(num);
    }
}
