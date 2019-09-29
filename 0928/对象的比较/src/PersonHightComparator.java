import java.util.Comparator;

public class PersonHightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.hight - o2.hight;
    }
}
