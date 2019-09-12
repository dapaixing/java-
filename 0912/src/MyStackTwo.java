public class MyStackTwo {
    private int[] array = new int[100];
    private int size = 0;
    public void push(int v){
        array[size++] = 0;
    }
    public int pop(){
        return array[--size];
    }
}
