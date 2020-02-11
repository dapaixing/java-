import java.util.Arrays;

public class 冒泡 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr){
        boolean flag = false;
        int temp = 0;
        for (int j = 0;j <arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;
            }
        }
    }
}
