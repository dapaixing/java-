public class Person implements Comparable<Person> {
    public int age;
    public String name;
    public int hight;
    public int weight;

    public Person(int age, String name,int hight,int weight) {
        this.age = age;
        this.name = name;
        this.hight = hight;
        this .weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
