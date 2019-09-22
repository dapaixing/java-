public class Heap2 {
    public static void shiftDown(int[] array, int index, int size) {
        int left = 2 * index + 1;
        while (left < size) {
            int right = left + 1;
            int min = left;
            if (right < size) {
                if (array[left] > array[right]) {
                    min = right;
                }
            }
            if (array[index] > array[min]) {
                swp(array, index, min);
                index = min;
                left = 2 * index + 1;
            } else {
                break;
            }
        }
    }

    private static void swp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
//        int [] a = { 27,15,19,18,28,34,65,49,25,37 };
//        shiftDown(a,0,a.length-1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.offer(7);
        queue.offer(9);
        queue.offer(5);
        System.out.println(queue.poll());
        queue.offer(3);
        System.out.println(queue.poll());
        queue.offer(10);
        queue.offer(8);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static void shiftUpSmall(int[] array,int i) {
        while (i>0){
            int parent = (i - 1)/2;
            if (array[parent] <= array[i]){
                break;
            }
            swp(array,parent,i);
            i = parent;
        }
    }

}
