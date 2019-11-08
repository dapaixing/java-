import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.nextLine();
            int max = 0,count = 0,end = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i)>='0'&&string.charAt(i)<='9'){
                    count++;
                    if (max<count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(string.substring(end - max+1,end+1));
        }
    }
    public class Parenthesis {
        public boolean chkParenthesis(String A, int n) {
            // write code here
            Stack<Character> lefts = new Stack<>();
            if (A == null || A.length() != n) {
                return false;
            }
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) == '(') {
                    lefts.push(A.charAt(i));
                } else if (A.charAt(i) == ')') {
                    if (lefts.empty()) {
                        return false;
                    } else {
                        lefts.pop();
                    }
                } else {
                    return false;
                }
            }
            if (!lefts.empty()) {
                return false;
            } else {
                return true;
            }
        }
    }
}
