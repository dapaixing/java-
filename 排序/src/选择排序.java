import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[a]>arr[j]){
                    a = j;
                }
            }
            if (a!=i) {
                temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
