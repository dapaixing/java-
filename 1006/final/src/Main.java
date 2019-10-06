public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;//未被final修饰的变量可以随意修改
        System.out.println(num1);

        final int num2;
        num2 = 100;//被final修饰过的只能进行一次赋值
        System.out.println(num2);

//        num2 = 10 错误写法
    }
}
