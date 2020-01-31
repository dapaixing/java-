public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMary();
    }
}
interface Marry{
    void happyMary();
}
class You implements Marry{
    @Override
    public void happyMary() {
        System.out.println("you and 嫦娥终于奔月了");
    }
}
class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMary() {
        ready();
        this.target.happyMary();
        after();
    }

    private void after() {
        System.out.println("闹玉兔");
    }

    private void ready() {
        System.out.println("布置主卧。。。。。");
    }
}
