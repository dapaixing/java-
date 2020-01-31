package Lambda表达式;

public class LambdaTest03 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("fafagd");
        }).start();
        new Thread(()-> System.out.println("afgadg"));
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("fafssfa");
            }
        }).start();
    }
}
