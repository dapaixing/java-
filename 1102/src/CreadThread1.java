public class CreadThread1 {
    private static class MyThread extends Thread{
        private int n = 0;

        @Override
        public void run() {
            while (n<60){
                System.out.println(n);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n++;
            }
        }
    }

    private static class ShareResource{
        private int n = 0;

        public ShareResource(int n) {
            this.n = n;
        }
    }
    private static class MyThread2 extends Thread{
        private int n = 0;

        @Override
        public void run() {
            while (n<60){
                System.out.println(n);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n++;
            }
        }
    }

    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t1 = new Thread(new MyThread());
//        Thread t2 = new Thread(new MyThread());
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        t1.start();
        t2.start();
    }
}
