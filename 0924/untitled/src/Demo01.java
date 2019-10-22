import java.sql.Array;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] a = {2, 3, 7, 9, 4, 5, 6, 9, 1, 4, 7, 8};
        int[] b = a.clone();
        //insertSort(b);
        selectSort2(b);
        System.out.println(Arrays.toString(b));
        int[] c = a.clone();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        Arrays.equals(a, b);
        System.out.println(Arrays.equals(c, b));

        long again = System.nanoTime();
        selectSort(a);
        long end = System.nanoTime();

//        double c = (again - end)*1.0/1000/1000;


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
}
