import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int len = line1.length();
        int count = 0;
        String s1,s2;
        StringBuilder sb;
        for (int i = 0; i <= len; i++) {
            s1 = line1.substring(0,i);
            s2 = line1.substring(i,len);
            sb = new StringBuilder(s1);
            sb.append(line2).append(s2);
            if (sb.toString().equals(sb.reverse().toString())){
                count++;
            }
            sb = null;
        }
        System.out.println(count);
        sc.close();
    }
}
