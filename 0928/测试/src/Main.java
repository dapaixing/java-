import java.util.Arrays;

interface Sortmethod{
    String getName();
    void sort(int[] array);
}

public class Main {
    public static void main(String[] args) {
        Sortmethod[] a = {
                new MergeSort(),
                new quickSort()
        };
        int [] b = {9, 5, 2, 7, 3, 6, 8 };
        int [] c = {9, 5, 2, 7, 3, 6, 8 };
        a[0].sort(b);
        a[1].sort(c);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
