package frank.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //加载Spring的配置文件，初始化上下文：生成Bean对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
// 新增这里
//        Object o = context.getBean("duck1");
//        System.out.println(o.getClass());
//        System.out.println(o);
//        Object o2 = context.getBean("duck2");
//        System.out.println(o2.getClass());
//        System.out.println(o2);
//        Object o3 = context.getBean("duckShop");
//        System.out.println(o3.getClass());
//        System.out.println(o3);
        Object duckShop = context.getBean(DuckShop.class);
        System.out.println(duckShop.getClass());
        System.out.println(duckShop);


    }
}
