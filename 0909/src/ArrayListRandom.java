import java.util.ArrayList;
import java.util.Random;

/*
生成6个1~33之间的随机整数,添加到集合,并遍历

 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
