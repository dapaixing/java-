package 暂停sleep;

public class BlockedSleep implements Runnable {
    private int ticketNums = 99;
    @Override
    public void run() {
        while (true){
            if (ticketNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+ticketNums--);
        }
    }
}
