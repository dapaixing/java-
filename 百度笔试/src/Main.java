import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int max = 0;
//        int temp = 0;
//        for (int i = 1; i < n; i++) {
//            for (int j = i+1; j <= n; j++) {
//                temp = lcm(i,j) - gcd(i,j);
//                if (temp > max){
//                    max = temp;
//                }
//            }
//        }
//        System.out.println(max);
        System.out.println(n*n - (n+1));
    }
    private static int lcm(int n,int m){
        return n * m / gcd(n,m);
    }
    private static int gcd(int n,int m){
        if (n < m){
            int temp = n;
            n = m;
            m = temp;
        }
        while (n % m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        return m;
    }
}
