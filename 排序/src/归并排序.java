import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    private static void merge(int[] array, int low, int mid, int high){
//        int i = low;
//        int j = mid;
//        int len = high-low;
//        int [] extra = new int[len];
//        int k = 0;
//        while (i<mid&&j<high){
//            if (array[i]<=array[j]){
//                extra[k++] = array[i++];
//            }else {
//                extra[k++] = array[j++];
//            }
//        }
//        while (i<mid){
//            extra[k++] = array[i++];
//        }
//        while (j<high){
//            extra[k++] = array[j++];
//        }
//        for (int t = 0; t < len; t++) {
//            array[t+low] =extra[t];
//        }
//    }
//
//    public static void mergeSort(int[] array){
//        mergeSortInternal(array, 0, array.length);
//    }
//
//    private static void mergeSortInternal(int[] array, int low, int length) {
//        if (low - 1>=length){
//            return;
//        }
//        int mid = (length+low)/2;
//        mergeSortInternal(array,low,mid);
//        mergeSortInternal(array,mid,length);
//        merge(array,low,mid,length);
//    }



    public static void mergeSort(int[] a) {
        mergeSortRecursion(a, 0, a.length-1);
    }


    public static void mergeSortRecursion(int[] a, int p, int r) {
        // 递归终止条件
        if (p >= r) {
            return;
        }

        // 取p到r之间的位置q
        int q = p + (r - p) / 2;
        // 分治递归
        mergeSortRecursion(a, p, q);
        mergeSortRecursion(a, q + 1, r);

        // 将A[p...q]和A[q+1...r]合并为A[p...r]
        merge(a, p, q, r);
    }


    public static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tmp = new int[r - p + 1];

        // 最少把一个数组中的数据取完。
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据。
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        // 将剩余的数据copy到临时数组 tmp。
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        //将 tmp 中的数据拷贝回 a 中
        System.arraycopy(tmp, 0, a, p, r - p + 1);
    }

}
