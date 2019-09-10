import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String s = sc.next();
        int x = 0;
        int d = 0;
        int z = 0;
        int t = 0;
        char[] Arraychar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch = Arraychar[i];
            if (ch >= 'A' && ch <= 'Z'){
                x++;
            }else if (ch >= 'a' && ch <= 'z'){
                d++;
            }else if(ch >= '0' && ch <= '9'){
                z++;
            }else {
                t++;
            }
        }
        System.out.println(x);
        System.out.println(d);
        System.out.println(z);
        System.out.println(t);
    }
}
