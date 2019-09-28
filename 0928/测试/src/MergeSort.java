public class MergeSort implements Sortmethod {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void sort(int[] array) {
        mergeSortInter(array, 0, array.length);
    }
    private static void mergeSortInter(int[] array, int left, int right) {
        if (left >= right - 1) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortInter(array, left, mid);
        mergeSortInter(array, mid, right);
        mergree(array, left, mid, right);
    }

    private static void mergree(int[] array, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int lenght = right - left;
        int[] extra = new int[lenght];

        int k = 0;

        while (i < mid && j < right) {
            if (array[i] <= array[j]) {
                extra[k++] = array[i++];
            } else {
                extra[k++] = array[j++];
            }
        }
        while (i < mid) {
            extra[k++] = array[i++];
        }
        while (j < right) {
            extra[k++] = array[j++];
        }
        for (int i1 = 0; i1 < lenght; i1++) {
            array[left+i1] = extra[i1];
        }
    }
//    public static void mergeSort2(int[] array){
//        for (int i = 0; i < array.length; i = i*2) {
//
//        }
//    }
}
