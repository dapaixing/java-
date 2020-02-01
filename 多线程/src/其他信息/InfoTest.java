package 其他信息;

public class InfoTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().isAlive());
        MyInfo info = new MyInfo("战斗机");
        Thread t = new Thread(info);
        t.setName("公鸡");
        t.start();
        Thread.sleep(1000);
        System.out.println(t.isAlive());
    }
}
class MyInfo implements Runnable{
    private String name;

    public MyInfo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+name);
    }
}
