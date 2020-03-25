import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                a[i][i1] = sc.nextInt();
            }
        }
        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n - 1; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                if (a[j][i]-a[j][i+1]>=0){
                    if (sum>a[j][i]-a[j][i+1]) {
                        sum = a[j][i]-a[j][i+1];
                        arr[i] = a[j][i];
                        if (i == n-2){
                            arr[i+1] = a[j][i+1];
                        }
                    }
                }else {
                    if (sum>(-(a[j][i]-a[j][i+1]))){
                        sum = (-(a[j][i]-a[j][i+1]));
                        arr[i] = a[j][i];
                        if (i == n-2){
                            arr[i+1] = a[j][i+1];
                        }
                    }
                }
            }
        }
        System.out.println(arr[0]);
    }
}
