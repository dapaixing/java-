//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int[] disk = new int[n]; //桌子数组
//            for (int i = 0; i < n; i ++) {
//                disk[i] = sc.nextInt();
//            }
//            Arrays.sort(disk); // 桌子容纳量从小到大排序
//            PriorityQueue<Customer> queue = new PriorityQueue<>(); // 将客人按消费额降序加入优先级队列
//            for (int i = 0; i < m; i ++) {
//                int b = sc.nextInt();
//                int c = sc.nextInt();
//                if(b <= disk[n - 1]) queue.add(new Customer(b, c)); // 如果人数小于桌子最大容纳量,加入队列
//            }
//            boolean[] visited = new boolean[n]; // 记录桌子是否被占用
//            long sum = 0; // 记录总盈利
//            int count = 0; // 记录已使用的桌子数
//            while ( ! queue.isEmpty()) {
//                Customer customer = queue.poll();
//                for (int i = 0; i < n; i ++) { // 为客人分配桌子
//                    if(customer.peopleCount <= disk[i] && ! visited[i]) {
//                        sum += customer.moneyCount;
//                        visited[i] = true;
//                        count ++;
//                        break;
//                    }
//                }
//                if(count == n) break;
//            }
//            System.out.println(sum);
//        }
//    }
//
//    static class Customer implements Comparable<Customer> {
//        private int peopleCount;
//        private int moneyCount;
//
//        public Customer(int peopleCount, int moneyCount) {
//            this.peopleCount = peopleCount;
//            this.moneyCount = moneyCount;
//        }
//
//        @Override
//        public int compareTo(Customer o) {
//            if(o.moneyCount > this.moneyCount) return 1;
//            else if(o.moneyCount < this.moneyCount) return - 1;
//            return 0;
//        }
//    }
//}
//class Solution1 {
//    TreeNode pre=null;
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree==null)
//            return null;
//        Convert(pRootOfTree.right);
//        if(pre==null)
//            pre=pRootOfTree;
//        else{
//            pRootOfTree.right=pre;
//            pre.left=pRootOfTree;
//            pre=pRootOfTree;
//        }
//        Convert(pRootOfTree.left);
//        return pre;
//    }
//
//    public static void main(String[] args) {
//        int [] array = {1,2,3,2,2,2,5,4,2};
//        int a = MoreThanHalfNum_Solution(array);
//        System.out.println(a);
//    }
//    public static int MoreThanHalfNum_Solution(int [] array) {
//        if(array == null||array.length == 0){
//            return 0;
//        }
//        int max = 0;
//        int temp = 0;
//        Arrays.sort(array);
//        int v = array[0];
//        for(int i = 1;i<array.length;i++){
//            if(temp > (array.length)/2){
//                max = array[i-1];
//                break;
//            }
//            if(v==array[i]){
//                temp++;
//            }else{
//                v = array[i];
//                temp = 1;
//            }
//        }
//        return max;
//    }
//}
//import java.util.*;
//
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            String ip=in.nextLine();
//            String p=in.nextLine();
//            System.out.println(IptoTen(ip));
//            TentoIp(p);
//
//        }
//    }
//
//    private static void TentoIp(String p) {
//        long temp=Long.parseLong(p);
//        String ip=Long.toBinaryString(temp);
//
//        StringBuilder sb=new StringBuilder();
//        if(ip.length()<32){
//            for(int i=0;i<(32-ip.length());i++){
//                sb.append(0);
//            }
//            sb.append(ip);
//        }else if(ip.length()==32){
//            sb.append(ip);
//        }
//
//        for(int i=0;i<sb.length()-8;i=i+8){
//
//            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
//        }
//
//        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));
//
//    }
//
//    private static long IptoTen(String ip) {
//        String[] arr=ip.split("\\.");
//        long n=Long.parseLong(arr[0]);
//
//        for(int i=1;i<arr.length;i++){
//            n=n<<8;
//            n=n+Long.parseLong(arr[i]);
//        }
//
//        return n;
//    }
//
//
//}
import java.util.*;
public class Main {
    public static boolean checkLength(String password){
        if (password==null || password.length()<=8)
            return false;
        return true;
    }
    public static boolean checkCharKinds(String password){
        int Digit=0 , lowercase=0,uppercase=0,others=0;
        char[] ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9') {
                Digit=1;
                continue;
            }
            else if (ch[i]>='a'&&ch[i]<='z') {
                lowercase=1;
                continue;
            }
            else if (ch[i]>='A'&&ch[i]<='Z') {
                uppercase=1;
                continue;
            }else {
                others=1;
                continue;
            }
        }
        int total = Digit+lowercase+uppercase+others;
        return total>=3 ? true : false;
    }
    public static boolean checkCharRepeat(String password){
        for(int i=0 ;i<password.length()-2 ;i++){
            String substr1 =password.substring(i, i+3);
            if (password.substring(i+1).contains(substr1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String psw = cin.nextLine();
            if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }
}