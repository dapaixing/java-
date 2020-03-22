import javax.sql.DataSource;
import java.io.DataInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.WeakHashMap;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] s = str.split(" ");
//        int[] arr = new int[s.length];
//        int[] sum = new int[s.length];
//        for (int i = 0; i < s.length; i++) {
//            int i1 = Integer.parseInt(s[i]);
//            arr[i] = i1;
//        }
//        int v = 0;
//        for (int i = 1; i < arr.length; i++) {
//            v = 0;
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[j] > arr[i]) {
//                    v += 1;
//                }
//            }
//            if (v == 1) {
//                sum[i] = i;
//            }
//        }
//        for (int i = 0; i < sum.length; i++) {
//            if (sum[i] != 0) {
//                v = 1;
//            }
//        }
//        if (v == 0) {
//            System.out.println(-1);
//        } else {
//            for (int i = 0; i < sum.length; i++) {
//                if (sum[i] != 0) {
//                    System.out.print(sum[i]+" ");
//                }
//            }
//        }
//    }

//    public static int[] DistanceToHigher(int[] height) {
//        // write code here
//        int[] arr = new int[height.length];
//        for (int i = height.length - 1;i>=0;i--){
//            for (int j = i;j>=0;j--){
//                if (height[i]<height[j]){
//                    arr[i] = i-j;
//                    break;
//                }
//            }
//        }
//        return arr;
//    }
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(",");
        int t = 0;
        int t1 = 0;
        int d = 0;
        int d1 = 0;
        double[] arr = new double[s.length];
        String[] sum = new String[s.length];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 3; j < s[i].length(); j++) {
                if (s[i].charAt(j) == s[i].charAt(j+1)){
                    t+=1;
                    if (t>d){
                        d = t;
                    }
                }else {
                    t = 0;
                }
                if (s[i].charAt(j) == s[i].charAt(j+1)-1){
                    t1 += 1;
                    if (t1>d1){
                        d1 = t1;
                    }
                }
            }
            if (d>=d1&&d>3){
                arr[i] = d+0.5;
            }else if (d1>d && d1>3){
                arr[i] = d1;
            }
        }
        int m = 0;
        for (int i = 0;i<arr.length;i++){
            m = 0;
            for(int j = 0;j<arr.length;j++){
                if (arr[m]<arr[j]){
                    m = j;
                }
            }
            arr[m] = 0;
            sum[i] = s[m];
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i]!=null&&sum[i+1]!=null){
                System.out.print(sum[i]+",");
            }else if (sum[i]!=null&&sum[i+1] == null){
                System.out.print(sum[i]);
            }
        }
    }
}
