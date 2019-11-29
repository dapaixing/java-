//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int num = Test(n);
//        System.out.println(num);
//    }
//
//    private static int Test(int n) {
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        int tempold = 1;
//        int tempyoung = 1;
//        int mounth1 = 1;
//        int mounth2 = 0;
//        for(int j = 4; j <= n; j++){
//            tempold += mounth2;
//            mounth2 = mounth1;
//            mounth1 = tempold;
//            tempyoung = mounth1 + mounth2;
//
//        }
//        return tempold + tempyoung;
//    }
//
////    public int getValue(int[] gifts, int n) {
////        // write code here
////        Arrays.sort(gifts);
////        int num = gifts[n/2];
////        int t= 0;
////        int m = 0;
////        for (int i = 0; i < n; i++) {
////            if (gifts[i] == num){
////                t++;
////            }
////        }
////        if (t > n/2){
////            m = num;
////        }
////        return m;
////    }
////    public ListNode partition(ListNode pHead, int x) {
////        // write code here
////        if(pHead == null || pHead.next == null)
////        {
////            return pHead;
////        }
////        ListNode cur = pHead;
////        ListNode Shead = new ListNode(-1);
////        ListNode Bhead = new ListNode(-1);
////        ListNode Stmp = Shead;
////        ListNode Btmp = Bhead;
////        while(cur != null){
////            if(cur.val < x){
////                Stmp.next = new ListNode(cur.val);
////                Stmp = Stmp.next;
////            }else{
////                Btmp.next = new ListNode(cur.val);
////                Btmp = Btmp.next;
////            }
////            cur = cur.next;
////        }
////        cur = Shead;
////        while(cur.next != null && cur.next.val != -1){
////            cur = cur.next;
////        }
////        cur.next = Bhead.next;
////        return Shead.next;
////    }
//}
//
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            char[] sw=new char[130];
            String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String str2="VWXYZABCDEFGHIJKLMNOPQRSTU";
            for(int i=0;i<str1.length();i++){
                sw[str1.charAt(i)]=str2.charAt(i);
            }
            String str=sc.nextLine();
            String result="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    result+=" ";
                }else{
                    result+=sw[str.charAt(i)];
                }
            }
            System.out.println(result);
        }
    }
}