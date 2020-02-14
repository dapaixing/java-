package p1;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = i;
            for (int j = a; j < arr.length; j++) {
                if (arr[a]>arr[j]){
                    a = j;
                }
            }
            if (a!=i){
                temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void selectSort2(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[a]>arr[j]){
                    a = j;
                }
            }
            if (a!=i){
                temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
