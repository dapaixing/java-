package 线程同步;

public class SynBlockTest03 {
    public static void main(String[] args) {
        SynWeb12306 web = new SynWeb12306();
        System.out.println(Thread.currentThread().getName());
        new Thread(web, "发").start();
        new Thread(web, "阿飞").start();
        new Thread(web, "安防").start();
    }
}

class SynWeb12306 implements Runnable {
    private int tick = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            test4();
        }
    }

    public void test() {
        synchronized (this) {
            if (tick <= 0) {
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---->" + tick--);
        }
    }

    public void test2() {
        synchronized ((Integer) tick) {
            if (tick <= 0) {
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---->" + tick--);
        }
    }

    public void test3() {
        synchronized (this) {
            if (tick <= 0) {
                flag = false;
                return;
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "---->" + tick--);
    }
    public void test4() {
        if (tick <= 0) {
            flag = false;
            return;
        }
        synchronized (this) {
            if (tick <= 0) {
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---->" + tick--);
        }
    }
}
