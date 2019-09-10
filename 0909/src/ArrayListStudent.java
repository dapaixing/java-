import java.util.ArrayList;

/*
自定义4个学生对象,添加到集合,并遍历

 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("宋哈皮",20);
        Student two = new Student("麻瓜桑",20);
        Student three = new Student("憨憨中",20);
        Student four = new Student("舔狗帅",20);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("这名学生的名字是" + stu.getName() + "年龄是" + stu.getAge());
        }
    }
}
