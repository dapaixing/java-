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
    public static void insertSortGap(int [] arr,int gap){
        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            int j = i - gap;
            for (;j>=0&&v<arr[j];j-=gap){
                arr[j+gap] = arr[j];
            }
            arr[j+gap] = v;
        }
    }
}
