import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        a = Fib(n);
        System.out.println(a);
    }
    public static int Fib(int n){
        int i = 0;
        while (true){
            if (F(i) >= n){
                break;
            }else {
                i++;
            }
        }
        int m = n - F(i-1);
        int t = F(i) - n;
        if (m>t){
            m = t;
        }
        return m;
    }
    public static int F(int f){
        if(f == 0) {
            return 0;
        }
        else if(f <= 2){
            return 1;
        }
        int a = 1;
        int b = 1;
//        return F(f-1)+F(f-2);
        for (int i = 3 ; i <= f; i++) {
            int t = a+b;
            a = b;
            b = t;
        }
        return b;
    }
}
