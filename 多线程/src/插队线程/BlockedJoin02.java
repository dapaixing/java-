package 插队线程;

public class BlockedJoin02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("爸爸和儿子买烟的故事");
        new Thread(new Father()).start();
    }
}
class Father implements Runnable{
    @Override
    public void run() {
        System.out.println("想抽烟，发现烟没了");
        System.out.println("让儿子去买烟");
        Thread t = new Thread(new Son());
        t.start();
        try {
            t.join();
            System.out.println("老爸接过烟，把零钱给了儿子");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("孩子走丢了，老爸去找孩子了");
        }
    }
}
class Son implements Runnable{
    @Override
    public void run() {
        System.out.println("接过老爸的钱去买烟");
        System.out.println("路过游戏厅，玩了十小时");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"小时过去了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("赶紧买烟去");
        System.out.println("把烟给老爸");
    }
}
