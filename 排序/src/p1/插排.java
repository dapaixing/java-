package p1;

import java.util.Arrays;

public class 插排 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for(;j>=0&&array[j]>v;j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }
    public static void insertSort2(int [] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for (;j>=0&&array[j]>v;j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }
    public static void insertSort3(int [] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i -1 ;
            for (;j>=0&&array[j]>v;j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }
}
