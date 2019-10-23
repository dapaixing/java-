public class Main {
    public static void main(String[] args) {
        ThreadZi threadZi = new ThreadZi();
        threadZi.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
