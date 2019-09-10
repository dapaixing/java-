//定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。

public class StringTest1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arrayToString(arr);
        System.out.println("s:" + s);
    }
    public static String arrayToString(int[] arr){
        String s = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                s += "word" + arr[i] + "]";
            }else {
                s += "word" + arr[i] + "@";
            }
        }
        return s;
    }
}
