public class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("我这MyThread中执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
