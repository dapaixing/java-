import java.util.Arrays;
//请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
public class ArraysTest {
    public static void main(String[] args) {
        String line = "dsfgeqatgweafq";

        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
