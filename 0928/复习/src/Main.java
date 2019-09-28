public class Main {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
//    private static void quickSortInternal(int[] array, int left, int right){
//        if (left>=right){
//            return;
//        }
//        int pivotIndex = partition(array,left,right);
//        quickSortInternal(array,left,pivotIndex - 1);
//        quickSortInternal(array,pivotIndex + 1,right);
//    }
//    private static int partition(int[] array, int left, int right){
//        int i = left;
//        int j = right;
//        int k = array[left];
//        while (i<j){
//            while (i<j&&array[j] > array[k]){
//                j--;
//            }
//            while (i<j&&array[i]<array[k]){
//                i++;
//            }
//            swap(array,i,j);
//        }
//        swap(array,i,left);
//        return i;
//    }
//    private static int partition2(int[] array, int left, int right){
//        int i = left;
//        int j = right;
//        int k = array[left];
//        while (i<j){
//            while (i<j&&array[j] > array[k]){
//                j--;
//            }
//            array[i] = array[j];
//
//            while (i<j&&array[i]<array[k]){
//                i++;
//            }
//            array[j] = array[i];
//        }
//        array[i] = k;
//        return i;
//    }
//    private static int partition3(int[] array, int left, int right){
//        int d = left + 1;
//        int k = array[left];
//        for (int i = left + 1; i < array.length; i++) {
//            if (array[i] < k) {
//                swap(array, d, i);
//                d++;
//            }
//        }
//        swap(array,d-1,left);
//        return d-1;
//    }
//    private static void swap(int[] array, int i, int j) {
//        int tmp = array[i];
//        array[i] = array[j];
//        array[j] = tmp;
//    }
}
