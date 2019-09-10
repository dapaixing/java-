import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> neate(int numPows){
        List<List<Integer>> step = new ArrayList<>();
        step.add(new ArrayLisget<>());
        step.add(new ArrayList<>());
        step.add(new ArrayList<>());
        step.add(new ArrayList<>());
        step.add(new ArrayList<>());

        for (int i = 0; i < num; i++) {
            step.add(new ArrayList<>());
        }

        for (int i = 0;i<num;i++){
            for (int i1 = 0; i1 < i; i1++) {
                step.get(i).add(1);
            }
        }
        for(int i = 2;i < numPows;i++){
            for(int j = 1;j<i;j++){
                int a = step.get(i-1).get(j-1);
                int b = step.get(i-1).get(j);
                step.get(i).set(j,a+b);
            }
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTra().);
    }
}
