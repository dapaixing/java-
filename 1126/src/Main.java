//import java.util.*;
//public class Main{
//    public static void main(String[] ags){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String s = sc.next();
//            int n = sc.nextInt();
//            int max = 0;
//            int t = 0;
//            for(int i = 0;i <= s.length()-n;i++){
//                int count = 0;
//                for(int j = i;j<i+n;j++){
//                    if(s.charAt(j) == 'G'||s.charAt(j) == 'C'){
//                        count++;
//                    }
//                }
//                if(count > max){
//                    t = i;
//                    max = count;
//                }
//            }
//            System.out.println(s.substring(t,t+n));
//        }
//    }
//}
//import java.lang.Math;
//public class Main{
//    public static void main(String[] args){
//        long sumRich=0;
//        long sumStranger=0;
//        for(int i=1;i<=30;i++){
//            sumRich+=10;
//            sumStranger=sumStranger+(long)Math.pow(2,i-1);
//        }
//        System.out.print(sumRich+" "+sumStranger);
//    }
//}

import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] hasSub = new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            hasSub[i] = s.contains(p[i]);
        }
        return hasSub;
    }
}