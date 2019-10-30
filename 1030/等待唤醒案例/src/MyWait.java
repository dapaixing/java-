public class MyWait {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子做好了，顾客1开吃");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("包子做好了，顾客2开吃");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //五秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板用了5秒钟做好了包子");
                        //obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
