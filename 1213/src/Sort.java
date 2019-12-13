import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] array = {2,3,5,7,9,4,6,9,1,4,7,8};
//        insertSort(array);
//        shellSort(array);
//        selectSort2(array);
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = 0;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {

                array[j + 1] = array[j];

            }
            array[j + 1] = key;
        }
    }
    public static void shellSort(int [] array){
        int gap = array.length;
        while (true){
            gap = (gap / 3)+1;
            insertSortWithGap(array,gap);
            if (gap == 1){
                break;
            }
        }
    }

    private static void insertSortWithGap(int[] array, int gap) {
        for(int i = gap;i<array.length;i++){
            int key = array[i];
            int j = 0;
            for (j = i - gap; j >= 0 && array[j] > key; j-=gap) {

                array[j + gap] = array[j];

            }
            array[j + gap] = key;
        }
    }
    public static void selectSort(int [] array){
        for(int i = 0;i<array.length-1;i++){
            int maxIndex = 0;
            for(int j = 0;j<array.length-i;j++){
                if (array[j]>array[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(array,maxIndex ,array.length-1-i);
        }
    }

    public static void selectSort0(int [] array){
        for(int i = 0;i<array.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array,minIndex ,i);
        }
    }
    public static void selectSort2(int [] array){
        int begin = 0;
        int end = array.length-1;
        while (begin<end){
            int minIndex = begin;
            int maxIndex = begin;
            for (int j = begin+1;j<=end;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
                if(array[j]>array[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(array,minIndex,begin);
            if (maxIndex == begin){
                maxIndex = minIndex;
            }
            swap(array,maxIndex,end);
            begin++;
            end--;
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void heapSort(int [] array){
        createHeapBig(array);
        for (int i = 0;i<array.length-1;i++){


            swap(array,0,array.length-i-1);
            shiftDownBig(array,0,array.length-1-i);
        }
    }

    private static void createHeapBig(int[] array) {
        for (int i = (array.length-2)/2;i>=0;i--){
            shiftDownBig(array,i,array.length);
        }
    }

    private static void shiftDownBig(int[] array, int i, int size) {
        while (2*i+1<size){
            int max = 2*i+1;
            if (max+1<size && array[max+1]>array[max]){
                max = max+1;
            }
            if (array[i]>=array[max]){
                return;
            }
            swap(array,i,max);
            i = max;
        }
    }
    public static void bubbleSort(int[] array){
        for(int i = 0;i<array.length;i++){
            boolean isSorted = true;
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
    }
    public static void quickSort(int [] array){
        quickSortInter(array,0,array.length-1);
    }

    private static void quickSortInter(int[] array, int left, int right) {
        if (left>=right){
            return;
        }

        int pivotIndex = partition(array,left,right);

        quickSortInter(array,left,pivotIndex-1);
        quickSortInter(array,pivotIndex+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i<j){
            while (i<j&&array[j]>=pivot){
                j--;
            }
            while (i<j&&array[i]<=pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
}
