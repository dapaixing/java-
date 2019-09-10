import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(100) + 1;

        Scanner n = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜的数字：");
            int guess = n.nextInt();

            if (guess > random){
                System.out.println("猜大了");
            }else if (guess < random){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
