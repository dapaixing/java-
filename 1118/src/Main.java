import java.util.*;

public class Main {
    public String[] getGray(int n) {
        String[] g = null;
        if(n == 1){
            g = new String[]{"0","1"};
        }else{
            String[] s = getGray(n-1);
            g = new String[2*s.length];
            for(int i=0; i<s.length; i++){
                g[i] = "0"+s[i];
                g[g.length-1-i] = "1"+s[i];
            }
        }
        return g;
    }
}
//import java.util.*;
//
//public class Exchange {
//    public int[] exchangeAB(int[] AB) {
//        // write code here
//        AB[0] = AB[0]+AB[1];
//        AB[1] = AB[0]-AB[1];
//        AB[0] = AB[0] - AB[1];
//        return AB;
//    }
//}