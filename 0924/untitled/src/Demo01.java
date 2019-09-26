import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        int[] a = {2, 3, 7, 9, 4, 5, 6, 9, 1, 4, 7, 8};
        int[] b = a.clone();
        //insertSort(b);
//        selectSort2(b);
        //heapSort(b);
        bubbleSort(b);
        System.out.println(Arrays.toString(b));
        int[] c = a.clone();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        Arrays.equals(a, b);
        System.out.println(Arrays.equals(c, b));
        testSpeed();` `
    }

    public static void testSpeed(){
        Random random = new Random(20190924);
        int[] a = new int[10*10000];
        for (int i = 0; i < 10 * 10000; i++) {
            a[i] = random.nextInt(10*10000);
        }
        long begin = System.nanoTime();
        //heapSort(a);
        bubbleSort(a);
        long end = System.nanoTime();

        double ms = (end - begin)*1.0/1000/1000;
        System.out.printf("一共耗时：%.5f 毫秒%n",ms);

    }
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            int t = array[max];
            array[max] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
    }

    public static void selectSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int t = array[min];
            array[min] = array[i];
            array[i] = t;
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > k; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = k;
        }
    }

    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            gap = gap / 2;
            insertSortWithGap(array, gap);
        }
        insertSortWithGap(array, 1);
    }

    private static void insertSortWithGap(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int k = array[i];
            int j = 0;
            for (j = i - gap; j >= 0; j--) {
                array[j + gap] = array[j];
            }
            array[j + gap] = k;
        }
    }

    public static void heapSort(int[] array) {
        creatheap(array);
        for (int i = 0; i < array.length; i++) {
            swp(array, 0, array.length - i - 1);
            shiftDown(array, array.length - i - 1, 0);
        }
    }

    private static void creatheap(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }

    private static void shiftDown(int[] array, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int right = left + 1;
            int max = left;
            if (right < size) {
                if (array[max] < array[right]) {
                    max = right;
                }
            }
            if (array[max] <= array[index]) {
                break;
            }
            swp(array, max, index);
            index = max;
            left = 2 * index + 1;
        }

    }

    private static void swp(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean isSort = true;
            for (int i1 = 0; i1 < array.length-1-i; i1++) {
                if (array[i1]>array[i1+1]){
                    swp(array,i1,i1+1);
                    isSort = false;
                }
            }
            if (isSort){
                break;
            }
        }
    }
}
