import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0) {
                b = false;
            }
        }
        if (b == false){
            System.out.println("不是素数");
        }else {
            System.out.println("是素数");
        }
    }
}
