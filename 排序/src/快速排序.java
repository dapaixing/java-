import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSortInternal(arr,0,arr.length-1);
    }

    private static void quickSortInternal(int[] arr, int left, int right) {
        if (left>=right){
            return;
        }

        int pivotIndex = partition(arr,left,right);

        quickSortInternal(arr,left,pivotIndex -1);
        quickSortInternal(arr,pivotIndex+1,right);
        
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int v = arr[left];
        while (i<j){
            while (i<j&&arr[j]>=v){
                j--;
            }
            while (i<j&&arr[i]<=v){
                i++;
            }
            swp(arr,i,j);
        }
        swp(arr,left,i);
        return i;
    }

    private static void swp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
