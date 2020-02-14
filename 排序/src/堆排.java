import java.util.Arrays;

public class 堆排 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] array){
        createHeap(array);
        for (int i = 0; i < array.length-1; i++) {
            swp(array,0,array.length-1-i);
            shiftDown(array,array.length-i-1,0);
        }
    }

    private static void createHeap(int[] array){
        for (int i = (array.length-1)/2;i>=0;i--){
            shiftDown(array,array.length,i);
        }
    }
    public static void shiftDown(int[] array, int size, int index){
        int left = 2*index+1;
        while (left<size){
            int right = left+1;
            int max = left;
            if (right<size){
                if (array[right]>array[left]){
                    max = right;
                }
            }

            if (array[max]<=array[index]){
                break;
            }
            swp(array,max,index);

            index = max;
            left = 2*index+1;
        }
    }

    private static void swp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
