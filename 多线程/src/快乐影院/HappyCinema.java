package 快乐影院;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
        list.add(7);

        List<Integer> seat1 = new ArrayList<>();
        seat1.add(1);
        seat1.add(2);
        List<Integer> seat2 = new ArrayList<>();
        seat2.add(4);
        seat2.add(5);
        seat2.add(6);
        Cinema c = new Cinema(list, "happy");
        new Thread(new Customer(c, seat1), "l").start();
        new Thread(new Customer(c, seat2),"w").start();
    }
}

class Cinema {
    List<Integer> available;
    String name;

    public Cinema(List<Integer> available, String name) {
        this.available = available;
        this.name = name;
    }

    public boolean bookTickets(List<Integer> seats) {
        System.out.println("可用位置为：" + available);
        List<Integer> copy = new ArrayList<>();
        copy.addAll(available);

        copy.removeAll(seats);

        if (available.size()-copy.size()!=seats.size()){
            return false;
        }
        available = copy;
        return true;
    }
}

class Customer implements Runnable {
    Cinema cinema;
    List<Integer> seats;

    public Customer(Cinema cinema, List<Integer> seats) {
        this.cinema = cinema;
        this.seats = seats;
    }

    @Override
    public void run() {
        synchronized (cinema) {
            boolean flag = cinema.bookTickets(seats);
            if (flag) {
                System.out.println("出票成功" + Thread.currentThread().getName() + "-<位置为：" + seats);
            } else {
                System.out.println("出票失败" + Thread.currentThread().getName() + "-<位置不够" + seats);
            }
        }
    }
}