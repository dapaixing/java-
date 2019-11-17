

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        int num = 0;
//        while ((i*i*i)<=n){
//            i++;
//            num++;
//        }
//        System.out.println(num);
//        int n = sc.nextInt();
////        int k = sc.nextInt();
////        int[] a = new int[n];
////        for (int i = 0; i < n; i++) {
////            a[i] = sc.nextInt();
////        }
////        int num = 0;
////        for(int i = 0;i<=n-k;i++){
////           if (isPrime(a[i])&&isPrime(a[i+1])){
////               num = a[i]+a[i+1];
////           }
////        }
//        for (int i = 2; i < 10000; i++) {
//            if (isPrime(i)){
//                System.out.println(i);
//            }
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(fun(m,n));
//
////        System.out.println(num);
//    }
//    public static boolean isPrime(int n){
//        for(int i=2;i<=n-1;++i){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static int fun(int m,int n) {
//        if (m <= 1 || n == 1)
//            return 1;
//        else if (n == 0)
//            return 0;
//        else if (n > m)
//            return fun(m, n - 1);
//        return fun(m - n, n) + fun(m, n - 1);
//
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String parnn = s.nextLine();
//        int ans=parnn.charAt(0) - '0';
//        for(int i=1; i<parnn.length()-1; i=i+2) {
//            int num = parnn.charAt(i+1) - '0';
//            char par = parnn.charAt(i);
//            switch(par) {
//                case '+': {
//                    ans = ans + num;
//                    break;
//                }
//                case '*':{
//                    ans = ans * num;
//                    break;
//                }
//            }
//
//        }
//        System.out.println(ans);
//
//    }
//}

//import java.util.Arrays;
//import java.util.Scanner;
//        public class Main{
//
//        public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        int b = sc.nextInt();
//
//        int c = sc.nextInt();
//
//        int[] d = new int[4];
//
//        d[0] = a + b + c;
//
//        d[1] = (a + b) * c;
//
//        d[2] = a + (b + c);
//
//        d[3] = a * b * c;
//
//        Arrays.sort(d);
//
//        System.out.println(d[3]);
//
//        }
//
//        }
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        int n = s1.indexOf("aeiou");
//        System.out.println(s1.toCharArray()[n]);
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int num = 0;
//        for (int i = 1; i <= n; i++) {
//            int temp = i;
//            while (temp!=0){
//                if(temp%10 == 2){
//                    break;
//                }
//                temp /= 10;
//            }
//            if (temp == 0){
//                num++;
//            }
//        }
//        System.out.println(num);
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int num = 0;
//        for (int i = 1; i <= n; i++) {
//            if((i%a!=0)&&(i%c!=0)&&(i%b!=0)){
//                num++;
//            }
//        }
//        System.out.println(num);
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[m][n];
        int x;
        int y;
        int z = 1;
        int t = 0;

        while(true){
            if(z > m * n)
                break;

            for(x=t,y=t; y<n-t; y++){
                arr[x][y] = z;
                z++;
            }

            for(x=t+1,y=n-1-t; x<m-t; x++){
                arr[x][y] = z;
                z++;
            }

            for(x=m-1-t,y=n-2-t; y>=t; y--){
                arr[x][y] = z;
                z++;
            }

            for(x=m-2-t,y=t; x>t; x--){
                arr[x][y] = z;
                z++;
            }
            t++;
        }
        System.out.println(arr[r-1][c-1]);
    }
}