import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scann er sc=new Scanner(System.in);
        String s=sc.nextLine();
        int num[]=new int[10];
        for(char c:s.toCharArray()){
            num[c-'0']++;
        }
        for(int i=0;i<10;i++){
            if(num[i]!=0)
                System.out.println(i+":"+num[i]);
        }
    }
}
public class Solution {
    public int[] multiply(int[] A) {
        int t = A.length;
        int[] B = new int[t];
        if(t != 0 ){
            B[0] = 1;
            for(int i = 1; i < t; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int tmp = 1;
            for(int j = t-2; j >= 0; j--){
                tmp *= A[j+1];
                B[j] *= tmp;
            }
        }
        return B;
    }
}