package 线程同步;

public class SafeTest02 {
    public static void main(String[] args) {
        Account account = new Account(1000,"结婚礼金");
        Drawing you = new Drawing(account,80,"可悲的你");
        Drawing wife = new Drawing(account,90,"happy的她");
        you.start();
        wife.start();
    }
}

