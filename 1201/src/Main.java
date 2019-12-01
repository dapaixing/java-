import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            char[] a = sc.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < a.length; i++) {
                if(set.add(a[i])){
                    sb.append(a[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }
}
