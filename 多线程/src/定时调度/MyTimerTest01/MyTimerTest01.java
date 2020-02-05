package 定时调度.MyTimerTest01;

import java.util.*;

public class MyTimerTest01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        timer.schedule(new MyTask(),1000);
//        timer.schedule(new MyTask(),1000,2000);
        Calendar cal=new GregorianCalendar(2020,2,5,10,53,54);
        timer.schedule(new MyTask(),cal.getTime(),2000);
    }
}
class MyTask extends TimerTask{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World！");
        }
        System.out.println("结束");
    }
}
