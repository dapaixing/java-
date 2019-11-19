public class MyQueue {
    private int [] array = new int[10];
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private Object empty = new Object();
    private Object full = new  Object();
    public synchronized  void put(int message) throws InterruptedException {
        if (size == array.length){}
        synchronized (full){
            full.wait();
        }
    }
    private static MyQueue queue = new MyQueue();
    private static class MyThread extends Thread{
        @Override
        public void run() {
            try {
                queue.put(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t =new MyThread();
        t.start();
        Thread.sleep(100);
        synchronized (queue.full){
            System.out.println("我加到锁了");
        }
    }
}
