import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 7, 9, 4, 5, 6, 9, 1, 4, 7, 8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array) {
        quickSortInter(array, 0, array.length - 1);
    }

    private static void quickSortInter(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotIndex = partition3(array, left, right);

        quickSortInter(array, left, pivotIndex - 1);
        quickSortInter(array, pivotIndex + 1, right);
    }

    private static int partition1(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            while (i < j && array[i] <= pivot) {
                i++;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        int tmp = array[i];
        array[i] = array[left];
        array[left] = tmp;
        return i;
    }

    private static int partition2(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] <= pivot) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }

    private static int partition3(int[] array, int left, int right) {
        int d = left + 1;
        int pivot = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < pivot) {
                swp(array, i, d);
                d++;
            }
        }
        swp(array, d - 1, left);
        return d - 1;
    }

    private static void swp(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static int partition4(int[] array, int left, int right) {
        int d = right - 1;
        int pivot = array[right];
        for (int i = left + 1; i <= right; i++) {
            if (array[i] > pivot) {
                swp(array, i, d);
                d--;
            }
        }
        swp(array, d + 1, right);
        return d + 1;
    }

    private static int quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length - 1);
        stack.push(0);
        while (!stack.isEmpty()) {
            int left = stack.pop();
            int right = stack.pop();

            if (left > right) {
                continue;
            }

            int pivotIndex = partition3(array, left, right);

            stack.push(right);
            stack.push(pivotIndex + 1);

            stack.push(pivotIndex - 1);
            stack.push(left);
        }
    }
}
