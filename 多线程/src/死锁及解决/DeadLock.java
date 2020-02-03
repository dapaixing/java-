package 死锁及解决;

public class DeadLock {
    public static void main(String[] args) {
        Markup l1 = new Markup(1,"大牙");
        Markup l2 = new Markup(0,"发姐");
        l1.start();
        l2.start();
    }
}
class Lipstick{

}
class Mirror{

}
class Markup extends Thread{
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;

    String girl;

    public Markup(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }

    @Override
    public void run() {
        markup();
    }

    private void markup(){
        if (choice == 0){
            synchronized (lipstick){
                System.out.println(this.girl+"涂口红");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mirror){
                System.out.println(this.girl+"照镜子");
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girl+"照镜子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lipstick){
                System.out.println(this.girl+"涂口红");
            }
        }
    }
}