package 线程同步;

class Drawing extends Thread{
    Account account;
    int drawMoney;
    int packetTotal;

    @Override
    public void run() {
        test();
    }
    public Drawing(Account account, int drawMoney, String name){
        super(name);
        this.drawMoney = drawMoney;
        this.account = account;
    }
    public void test() {
        //提高性能
        if (account.money<=0){
            return;
        }
        synchronized (account) {
            if (account.money - drawMoney < 0) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money -= drawMoney;
            packetTotal += drawMoney;
            System.out.println(this.getName() + "-->账号余额为" + account.money);
            System.out.println(this.getName() + "-->口袋的钱为" + packetTotal);
        }
    }
}
