public class MyPriorityQueue {
    private int[] array;
    private int size;

    MyPriorityQueue(){
        array = new int[16];
        size = 0;
    }

    public void offer(int element){
        array[size++] = element;
        Heap2.shiftUpSmall(array,size-1);
    }

    public int poll(){
        int element = array[0];
        array[0] = array[--size];
        Heap2.shiftDown(array,0,size);
        return element;
    }
}
