package 生产者模式;

public class CoTest02 {
    public static void main(String[] args) {
       Tv tv = new Tv();
       new Player(tv).start();
       new Watcher(tv).start();
    }
}
class  Tv{
    String voice;
    boolean flag = true;

    public synchronized void play(String voice){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("表演了："+voice);
        this.voice = voice;
        this.notifyAll();
        this.flag=!this.flag;
    }
    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("听到了："+voice);
        this.notifyAll();
        this.flag=!this.flag;
    }
}
class Player extends Thread{
    Tv tv;

    public Player(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0){
                this.tv.play("奇葩说");
            }else {
                this.tv.play("太污了，喝瓶立白洗洗嘴");
            }
        }
    }
}
class Watcher extends Thread{
    Tv tv;

    public Watcher(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}