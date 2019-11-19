import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class UseBlockingQueue {
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    //    private static BlockingQueue<String> queue = new LinkedBlockingDeque<>(10);
//    private static BlockingQueue<String> queue = new PriorityBlockingQueue<>(10);
    private static class Producer extends Thread {
        @Override
        public void run() {
            Random random = new Random(20191116);
            while (true) {
                try {
                    int massage = random.nextInt(100);
                    queue.put(String.valueOf(massage));
                    System.out.println("放入消息"+massage);
                    Thread.sleep(random.nextInt(3)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Customer extends Thread{
        Random random = new Random(20191116);
        @Override
        public void run() {
            while (true){
                try {
                    String message = queue.take();
                    System.out.println("收到消息"+message);
                    Thread.sleep(random.nextInt(3)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread customer = new Customer();
        producer.start();
        customer.start();
    }
}
