public class Test3 extends Thread {
    @Override
    public void run() {
        long num = 0;
        for (long i = 0; i <= 1000000; i++) {
            num += (i*i);
        }
        System.out.println(num);
    }
}
