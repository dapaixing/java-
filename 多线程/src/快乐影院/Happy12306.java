package 快乐影院;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Happy12306 {
    public static void main(String[] args) {
        Web12306 c = new Web12306(5, "happy");
        new Passemger(c,"老高",2).start();
        new Passemger(c,"老裴",3).start();

    }
}

class Passemger extends Thread{
    Cinema cinema;
    int seats;

    public Passemger(Runnable tarhet,String name,int seats) {
        super(tarhet,name);
        this.seats = seats;
    }

}

class Web12306 implements Runnable {
    int available;
    String name;

    public Web12306(int available, String name) {
        this.available = available;
        this.name = name;
    }

    public void run() {
        Passemger p= (Passemger) Thread.currentThread();
        boolean flag = this.bookTickets(p.seats);
        if (flag) {
            System.out.println("出票成功" + Thread.currentThread().getName() + "-<位置为：" + p.seats);
        } else {
            System.out.println("出票失败" + Thread.currentThread().getName() + "-<位置不够" + p.seats);
        }

    }

    public synchronized boolean bookTickets(int seats) {
        System.out.println("可用位置为：" + available);

        if (seats>available) {
            return false;
        }
        available-=seats;
        return true;
    }
}
