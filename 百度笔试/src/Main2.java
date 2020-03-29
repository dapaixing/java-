import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 0;
        while (!test2(arr,n)){
            k++;
            int temp = testi(arr);
            arr[temp] -= n;
            for (int i = 0; i < n; i++) {
                if (i != temp){
                    arr[i] += 1;
                }
            }
        }
        System.out.println(k);
    }
    private static int testi(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[temp]){
                temp = i;
            }
        }
        return temp;
    }
    private static boolean test2(int [] arr , int n){
        for (int i = 0; i < arr.length; i++) {
            if (n <= arr[i]){
                return false;
            }
        }
        return true;
    }
}
