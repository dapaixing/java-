import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (n > 0){
//            int num = Test(n);
//            System.out.println(num);
//            n = sc.nextInt();
//        }
        int [] a = {1,2,3,4,5,6,7,0};
        int n = count(a,8);
        System.out.println(n);
    }

    private static int Test(int n) {
        int num = n/3;
        int sum = num + n%3;
        while (sum>=3){
            num += sum/3;
            sum = sum/3 + sum%3;
        }
        if (sum == 2){
            num += 1;
        }
        return num;
    }
    public static int count(int[] A, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if(A[i]>A[j])
                    sum++;
        }
        return sum;
    }
}
