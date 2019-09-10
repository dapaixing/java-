import java.util.ArrayList;
import java.util.Random;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 33; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);
        }
        ArrayList<Integer> smalllist = getArraylist(biglist);
        System.out.println("偶数数量为：" + smalllist.size());
        System.out.println(smalllist);
    }
    public static ArrayList<Integer> getArraylist(ArrayList<Integer> list){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}
