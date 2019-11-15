/*

尾部所有的0都是由因子5*2得到的，
由于2.6.8 都可以视为因子2，所以因子2的个数远大于因子5的个数
所以只需要求出因子5的个数即可。
由于25,125这个数不止含有一个因子5，所以需要求完后递归调用n/5
以上。

能被5（5^1）整除的提供1个0
能被25（5^2）整除的提供2个0
能被125（5^3）整除的提供3个0
能被625（5^4）整除的提供4个0
所以 结果= n/5 + n/25 + n/125 + n/625
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

}