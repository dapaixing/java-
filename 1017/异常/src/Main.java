import com.sun.deploy.association.RegisterFailedException;

import java.util.Scanner;

public class Main {
    static String[] usernames = {"张三","李四","王麻子"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要注册的用户名");
        String username = sc.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) throws RegisterException {
        for (String name : usernames)
            if (name.equals(username)) {
                throw new RegisterException("该用户名已被注册");
            }
        System.out.println("恭喜您注册成功");
    }
}
