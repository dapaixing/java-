import sun.print.SunMinMaxPage;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int [] num = { -4,-1,-1,0,1,2};
        List<List<Integer>> list = new ArrayList();
        list = Sum(num);
        System.out.println(list);
    }
    public static List<List<Integer>> Sum(int [] numm){
        List<List<Integer>> list = new ArrayList();
        for (int i = 0; i < numm.length; i++) {

            for (int i1 = i+1; i1 < numm.length; i1++) {
                for (int i2 = i1+1; i2 < numm.length; i2++) {
                    if ((numm[i] + numm[i1] +numm[i2] == 0) ){
                        list.add(new ArrayList<>());
                        list.get(i).add(numm[i]);
                        list.get(i).add(numm[i1]);
                        list.get(i).add(numm[i2]);

                    }
                }
            }
        }
        return list;
    }
}
