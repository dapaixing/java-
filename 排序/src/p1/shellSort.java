package p1;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        shellSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort1(int[] array){
        int gap = array.length;
        while (gap>1){
            insertSortGap(array,gap);
            gap = (gap/3)+1;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - gap;
            for (;j>=0&&v<array[j];j-=gap){
                array[j+gap] = array[j];
            }
            array[j+gap] = v;
        }
    }
}
