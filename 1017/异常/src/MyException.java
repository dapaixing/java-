import java.util.ArrayList;
import java.util.List;

public class MyException {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        //System.out.println(arr[3]);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //System.out.println(list.get(3));
        try {
            //System.out.println(arr[3]);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
