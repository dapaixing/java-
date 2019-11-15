import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }

    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

}