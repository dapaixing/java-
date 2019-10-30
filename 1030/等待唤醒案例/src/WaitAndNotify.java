public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板要的包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后的代码
                    System.out.println("包子做好了，开吃");
                }
            }
        }.start();

        new Thread(() -> {
            //五秒做包子
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj){
                System.out.println("老板用了5秒钟做好了包子");
                obj.notify();
            }
        }).start();
    }
}
