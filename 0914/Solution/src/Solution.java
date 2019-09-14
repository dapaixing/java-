public class Solution {
    public int[] prrvPermOpt1(int [] A){
        for (int i = A.length - 2;i>= 0;i--){
            if (A[i] > A[i+1]){
                int tmp = i+1;
                for (int j = i+2;j<A.length;j++){
                    if (A[j] < A[i] && A[j] > A[tmp]){
                        tmp = j;
                    }
                }
                int tmpe = A[tmp];
                A[tmp] = A[i];
                A[i] = tmpe;
                return A;
            }
        }
    }
}
