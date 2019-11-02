public class Test2 extends Thread {
    @Override
    public void run() {
        long num = 0;
        for (int i = 0; i <= 1000000; i=i+2) {
            num += i;
        }
        System.out.println(num);
    }
}
