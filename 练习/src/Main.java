////
////import java.util.*;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        while (sc.hasNext()) {
////            int n = sc.nextInt();
////            int m = sc.nextInt();
////            int[] disk = new int[n]; //桌子数组
////            for (int i = 0; i < n; i ++) {
////                disk[i] = sc.nextInt();
////            }
////            Arrays.sort(disk); // 桌子容纳量从小到大排序
////            PriorityQueue<Customer> queue = new PriorityQueue<>(); // 将客人按消费额降序加入优先级队列
////            for (int i = 0; i < m; i ++) {
////                int b = sc.nextInt();
////                int c = sc.nextInt();
////                if(b <= disk[n - 1]) queue.add(new Customer(b, c)); // 如果人数小于桌子最大容纳量,加入队列
////            }
////            boolean[] visited = new boolean[n]; // 记录桌子是否被占用
////            long sum = 0; // 记录总盈利
////            int count = 0; // 记录已使用的桌子数
////            while ( ! queue.isEmpty()) {
////                Customer customer = queue.poll();
////                for (int i = 0; i < n; i ++) { // 为客人分配桌子
////                    if(customer.peopleCount <= disk[i] && ! visited[i]) {
////                        sum += customer.moneyCount;
////                        visited[i] = true;
////                        count ++;
////                        break;
////                    }
////                }
////                if(count == n) break;
////            }
////            System.out.println(sum);
////        }
////    }
////
////    static class Customer implements Comparable<Customer> {
////        private int peopleCount;
////        private int moneyCount;
////
////        public Customer(int peopleCount, int moneyCount) {
////            this.peopleCount = peopleCount;
////            this.moneyCount = moneyCount;
////        }
////
////        @Override
////        public int compareTo(Customer o) {
////            if(o.moneyCount > this.moneyCount) return 1;
////            else if(o.moneyCount < this.moneyCount) return - 1;
////            return 0;
////        }
////    }
////}
////class Solution1 {
////    TreeNode pre=null;
////    public TreeNode Convert(TreeNode pRootOfTree) {
////        if(pRootOfTree==null)
////            return null;
////        Convert(pRootOfTree.right);
////        if(pre==null)
////            pre=pRootOfTree;
////        else{
////            pRootOfTree.right=pre;
////            pre.left=pRootOfTree;
////            pre=pRootOfTree;
////        }
////        Convert(pRootOfTree.left);
////        return pre;
////    }
////
////    public static void main(String[] args) {
////        int [] array = {1,2,3,2,2,2,5,4,2};
////        int a = MoreThanHalfNum_Solution(array);
////        System.out.println(a);
////    }
////    public static int MoreThanHalfNum_Solution(int [] array) {
////        if(array == null||array.length == 0){
////            return 0;
////        }
////        int max = 0;
////        int temp = 0;
////        Arrays.sort(array);
////        int v = array[0];
////        for(int i = 1;i<array.length;i++){
////            if(temp > (array.length)/2){
////                max = array[i-1];
////                break;
////            }
////            if(v==array[i]){
////                temp++;
////            }else{
////                v = array[i];
////                temp = 1;
////            }
////        }
////        return max;
////    }
////}
////import java.util.*;
////
////
////public class Main {
////
////    public static void main(String[] args) {
////        Scanner in=new Scanner(System.in);
////        while(in.hasNext()){
////            String ip=in.nextLine();
////            String p=in.nextLine();
////            System.out.println(IptoTen(ip));
////            TentoIp(p);
////
////        }
////    }
////
////    private static void TentoIp(String p) {
////        long temp=Long.parseLong(p);
////        String ip=Long.toBinaryString(temp);
////
////        StringBuilder sb=new StringBuilder();
////        if(ip.length()<32){
////            for(int i=0;i<(32-ip.length());i++){
////                sb.append(0);
////            }
////            sb.append(ip);
////        }else if(ip.length()==32){
////            sb.append(ip);
////        }
////
////        for(int i=0;i<sb.length()-8;i=i+8){
////
////            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
////        }
////
////        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));
////
////    }
////
////    private static long IptoTen(String ip) {
////        String[] arr=ip.split("\\.");
////        long n=Long.parseLong(arr[0]);
////
////        for(int i=1;i<arr.length;i++){
////            n=n<<8;
////            n=n+Long.parseLong(arr[i]);
////        }
////
////        return n;
////    }
////
////
////}
//import java.util.*;
//public class Main {
//    public static boolean checkLength(String password){
//        if (password==null || password.length()<=8)
//            return false;
//        return true;
//    }
//    public static boolean checkCharKinds(String password){
//        int Digit=0 , lowercase=0,uppercase=0,others=0;
//        char[] ch = password.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i]>='0'&&ch[i]<='9') {
//                Digit=1;
//                continue;
//            }
//            else if (ch[i]>='a'&&ch[i]<='z') {
//                lowercase=1;
//                continue;
//            }
//            else if (ch[i]>='A'&&ch[i]<='Z') {
//                uppercase=1;
//                continue;
//            }else {
//                others=1;
//                continue;
//            }
//        }
//        int total = Digit+lowercase+uppercase+others;
//        return total>=3 ? true : false;
//    }
//    public static boolean checkCharRepeat(String password){
//        for(int i=0 ;i<password.length()-2 ;i++){
//            String substr1 =password.substring(i, i+3);
//            if (password.substring(i+1).contains(substr1))
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNextLine()) {
//            String psw = cin.nextLine();
//            if (checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw))
//                System.out.println("OK");
//            else
//                System.out.println("NG");
//        }
//    }
//}
//import java.util.Scanner;
////代码已通过测试，还望各位牛友批评指正
//public class Main{
//    //这道题着实让我折腾了好半天，首先要明白这是一个排列组合问题，
//    //我们拿5来说事，首先5个人来进行抽奖，有多少种抽法？
//    //因为是不放回抽，所以第一个人有5种抽法，
//    //第二个人有4种抽法，依次类推
//    //总共就是5！ 对有5的阶乘种抽法。这是分母
//    //那可想而知分子就是存在多少种情况每个人拿不到自己的名字。
//    //这里要应用错排算法。
//    //简单的做个介绍
//    //当n个编号元素放在n个编号位置，元素编号与位置编号各不对应的方法数用D(n)表示，
//    //那么D(n-1)就表示n-1个编号元素放在n-1个编号位置，各不对应的方法数，其它类推.
//    //第一步，把第n个元素放在一个位置，比如位置k，一共有n-1种方法；
//    //第二步，放编号为k的元素，这时有两种情况：把它放到位置n，那么，对于剩下的n-1个元素，
//    //由于第k个元素放到了位置n，剩下n-2个元素就有D(n-2)种方法；
//    //第k个元素不把它放到位置n，这时，对于这n-1个元素，有D(n-1)种方法；
//    //综上得到递推公式，可以发现可以用递归来做；
//    //D(n) = (n-1) [D(n-2) + D(n-1)]
//    //特殊地，D(1) = 0, D(2) = 1.
//    //那么D(5)=4*[D(3)+D(4)]；依次求得D(3)、D(4),最后D(5)=44
//    //所以5个人拿不到奖的概率就是44/120=36.67%
//    //这里只是简单介绍，具体想弄明白还是去百度错排算法吧
//    //下面看代码
//    public static float count(int n) {
//        //这个函数用来得到有多少种可能，每个人拿不到自己的名字，
//        //也就是得到分子
//        if(n==1){
//            //n=1的时候返回0
//            return 0;
//        }
//        if(n==2){
//            //n=2的时候返回1
//            return 1;
//        }else{
//            //否则就递归。
//            return (n-1)*(count(n-1)+count(n-2));
//        }
//    }
//    //下面的函数用来求阶乘，也是递归，最后得到分母
//    public static float probability(int n){
//        if(n==0){
//            //0的阶乘等于1，不用多说吧
//            return 1;
//        }else{
//            //阶乘表示，进行递归
//            return n*probability(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        do {
//            int n = sc.nextInt();
//            //将得到的分子分母进行相除，就可以得到概率了。
//            float result = (count(n)/probability(n))*100;
//            System.out.println(String.format("%.2f", result) + "%");
//        } while (sc.hasNext());
//    }
//}
/*
 给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
   解：此题使用递归的遍历方法也可以解决，但是会超时
   dp解决：
   以每个物品作为横轴，以背包容量作为纵轴
       0 1 2 3 4 5 6..........
     0 1 0 0 0 0 0 0..........
     5 1 0 0 0 0 1 0

      其中1表示前n件物品放入容量为M的背包有1种方法，（5，0）表示重量为5的物品放入容量为0的背包的背包有1中方法，即不放入。0表示恰好放满背包的方法为0
      当M>weight[i]时，dp[M]=dp[M]+dp[M-weight[i]];意义是：放入物品i和不放入物品i的方法总和
 */
//import java.util.*;
//public class Main{
//    public static long bag(int []weight,int n,int sum){
//        long dp[]=new long[sum+1];
//        dp[0]=1;
//        int i,j;
//        for(i=0;i<n;i++){
//            for(j=sum;j>=weight[i];j--){
//                dp[j]=dp[j-weight[i]]+dp[j];
//            }
//        }
//        return dp[sum];
//    }
//    public static void main(String args[]){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int sum=s.nextInt();
//        int i,j;
//        int arr[]=new int[n];
//        for(i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        System.out.println(bag(arr,n,sum));
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String str = in.nextLine();
//            jiCheck(str.toCharArray());
//        }
//    }
//    public static void jiCheck(char[] s){
//        int[] result = new int[8];
//        for(int i = 0; i < s.length; i++){
//            int oneNum = 0;
//            int one = 0x01;
//            int index = 7;
//            while(index > 0){
//                result[index] = ((s[i] & one) == 0) ? 0 : 1;
//                if(result[index] == 1) oneNum++;
//                one <<= 1;
//                index--;
//            }
//            if(oneNum % 2 == 0) result[0] = 1;
//            for(int k = 0; k < 8; k++){
//                System.out.print(result[k]);
//            }
//            System.out.println();
//            result[0] = 0;//update
//        }
//    }
//}


import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            BigInteger[] bg = new BigInteger[n];
            for(int i=0; i<n; i++)
                bg[i] = s.nextBigInteger();
            Arrays.sort(bg);
            for(int i=0; i<n; i++)
                System.out.println(bg[i]);
        }
    }
}