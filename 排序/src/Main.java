public class Main {
    public static void insertSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for(;j>=0&&array[j]>v;j--){
                array[j+1] = array[j];
            }
            array[j+1] = v;
        }
    }
    public static void bsInsertSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int v = array[i];
            int left = 0;
            int right = i;
            while (left<right){
                int m = (left+right)/2;
                if (v>=array[m]){
                    left = m+1;
                }else {
                    right = m;
                }
            }
            for (int j = i; j > left; j--) {
                array[j] = array[j-1];
            }
            array[left] = v;
        }
    }
}
