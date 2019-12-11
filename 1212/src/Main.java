import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = Fib(n)%10007;
        System.out.println(num);
    }

    private static int Fib(int n) {
//        if (n<=2){
//            return 1;
//        }
////        int a = 1;
////        int b = 1;
////        int c = 0;
////        for(int i  = 3;i<=n;i++){
////            c = a+b;
////            a = b;
////            b = c;
////        }
//        return Fib(n-1)+Fib(n-2);
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return n == 0 ? a : b;
    }
}
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long num = Test(n);
//        System.out.println(num);
//    }
//
//    private static long Test(int n) {
//        if (n <= 1){
//            return n;
//        }
//        long num = 0;
//        for (int i = 1; i <= n; i++) {
//            num += i;
//        }
//        return num;
//    }
//}
