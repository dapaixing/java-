import java.util.Arrays;

public class 堆排01 {
//    public static void main(String[] args) {
//        int[] arr = {3, 9, -1, -2, 20};
//        heapSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void heapSort(int[] arr) {
//        createHeap(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            swp(arr, 0, arr.length - 1);
//            shiftDown(arr, arr.length - i - 1, 0);
//        }
//    }
//
//    private static void createHeap(int[] array) {
//        for (int i = (array.length - 1) / 2; i >= 0; i--) {
//            shiftDown(array, array.length, i);
//        }
//    }
//
//    public static void shiftDown(int[] array, int size, int index) {
//        int left = 2 * index + 1;
//        while (left < size) {
//            int min = left;
//            int right = left + 1;
//            if (right < size) {
//                if (array[right] < array[left]) {
//                    min = right;
//                }
//            }
//            if (array[index] <= array[min]) {
//                break;
//            }
//            swp(array, min, index);
//            index = min;
//            left = index * 2 + 1;
//        }
//    }
//
//    private static void swp(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }


    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void heapSort(int[] arr) {
        //开始位置是最后一个非叶子节点，即最后一个节点的父节点
        int start = (arr.length - 1) / 2;
        //调整为大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        //先把数组中的第0个和堆中的最后一个数交换位置，再把前面的处理为大顶堆
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    public static void maxHeap(int[] arr, int size, int index) {
        //左子节点
        int leftNode = 2 * index + 1;
        //右子节点
        int rightNode = 2 * index + 2;
        int max = index;
        //和两个子节点分别对比，找出最大的节点
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        //交换位置
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            //交换位置以后，可能会破坏之前排好的堆，所以，之前拍好的堆需要重新调整
            maxHeap(arr, size, max);
        }

    }
}
