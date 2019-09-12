//请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
public class MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for(int i = (int)min;i<max;i++){
            int abs = Math.abs(i);
            if (abs>6||abs<2.1){
                count++;
            }
        }
        System.out.println(count);
    }
}
