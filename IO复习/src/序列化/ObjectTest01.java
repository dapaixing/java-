package 序列化;

import java.io.*;
import java.util.Date;

public class ObjectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(baos));

        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.writeObject("谁解其中味");
        dos.writeObject(new Date());
        Employee emp = new Employee("马云",400);
        dos.writeObject(emp);
        dos.flush();
        byte[] datas = baos.toByteArray();
        ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream( new ByteArrayInputStream(datas)));


        String mas = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(flag);
        Object str = dis.readObject();
        Object date = dis.readObject();
        Object empy = dis.readObject();
        if (str instanceof String){
            String str1 = (String) str;
            System.out.println(str1);
        }
        if (date instanceof Date){
            Date date1 = (Date) date;
            System.out.println(date1);
        }
        if (empy instanceof Employee){
            Employee empy1 = (Employee) empy;
            System.out.println(empy1.getName()+"-->"+empy1.getSalary());
        }
    }
}
class Employee implements Serializable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
