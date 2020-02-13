package p1;

import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

    private static void mergeSortInternal(int[] array, int low, int length){
        if (low>=length){
            return;
        }
        int mid = low + (length-low)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,length);
        merge(array,low,mid,length);
    }

    private static void merge(int[] array, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int [] extra = new int[high-low+1];
        int k = 0;

        while (i<=mid&&j<=high){
            if (array[i]<=array[j]){
                extra[k++] = array[i++];
            }else {
                extra[k++] = array[j++];
            }
        }
        while (i<=mid){
            extra[k++] = array[i++];
        }
        while (j<=high){
            extra[k++] = array[j++];
        }

        System.arraycopy(extra, 0, array, low, high-low+1);
    }


}
