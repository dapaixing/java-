import java.util.Arrays;

public class 归并排序01 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        mergeSortInternal(arr,0,arr.length-1);
    }

    private static void mergeSortInternal(int[] arr, int low, int high) {
        if (low>=high){
            return;
        }
        int mid = low+(high-low)/2;
        mergeSortInternal(arr,low,mid);
        mergeSortInternal(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int len = high-low +1;
        int [] extra = new  int[len];
        int k = 0;
        while (i<=mid&&j<=high){
            if (arr[i]<=arr[j]){
                extra[k++] = arr[i++];
            }else {
                extra[k++] = arr[j++];
            }
        }
        while (i<=mid){
            extra[k++] = arr[i++];
        }
        while (j<=high){
            extra[k++] = arr[j++];
        }

        for (int t = 0; t < len; t++) {
            arr[t+low] = extra[t];
        }
    }

}
