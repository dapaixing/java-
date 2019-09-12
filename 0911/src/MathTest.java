import java.sql.SQLOutput;
//一些Math基本方法的使用练习
public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.4));//3.4
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-2.5));//2.5
        System.out.println("========================");
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("========================");
        System.out.println(Math.floor(30.1));//30
        System.out.println(Math.floor(30.9));//30
        System.out.println(Math.floor(30.0));//30
        System.out.println("========================");
        System.out.println(Math.round(20.4));//20
        System.out.println(Math.round(20.5));//21
        System.out.println(Math.round(20.9));//21
        System.out.println("========================");
        System.out.println(Math.PI);
    }
}
