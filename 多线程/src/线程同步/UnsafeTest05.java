package 线程同步;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UnsafeTest05 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()-> list.add(Thread.currentThread().getName())).start();
        }
        Thread.sleep(10000);
        System.out.println(list.size());
    }
}
