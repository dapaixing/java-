package 线程同步;

public class UnsafeTest02 {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚礼金");
        Drawing you = new Drawing(account,80,"可悲的你");
        Drawing wife = new Drawing(account,90,"happy的她");
        you.start();
        wife.start();
    }
}
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class Drawing extends Thread{
    Account account;
    int drawMoney;
    int packetTotal;

    @Override
    public void run() {
        if (account.money-drawMoney<0){
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -= drawMoney;
        packetTotal += drawMoney;
        System.out.println(this.getName()+"-->账号余额为"+account.money);
        System.out.println(this.getName()+"-->口袋的钱为"+packetTotal);
    }

    public Drawing(Account account, int drawMoney, String name) {
        super(name);
        this.drawMoney = drawMoney;
        this.account = account;
    }

}