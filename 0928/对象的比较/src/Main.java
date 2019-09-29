import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person o1 = new Person(20,"小明",170,40);
        Person o2 = new Person(21,"小刚",170,50);

//        System.out.println(k);
//
//        Comparator<Person> comparator = new PersonNameComparator();
//        System.out.println("按照姓名比较");
//        int s = comparator.compare(o1,o2);
//        if (s < 0){
//            System.out.println("p小于q");
//        }
//        else if (s == 0){
//            System.out.println("p等于q");
//        }
//        else {
//            System.out.println("p大于q");
//        }
//
//        comparator = new PersonHightComparator();
//        System.out.println("按照身高比较");
//        int r = comparator.compare(o1,o2);
//        if (r < 0){
//            System.out.println("p小于q");
//        }
//        else if (r == 0){
//            System.out.println("p等于q");
//        }
//        else {
//            System.out.println("p大于q");
//        }
        int k = o1.compareTo(o2);
        Comparator<Person> comparator = new PersonNameComparator();
        int s = comparator.compare(o1,o2);
        comparator = new PersonHightComparator();
        int h = comparator.compare(o1,o2);
        comparator = new PersonWeightComparator();
        int w = comparator.compare(o1,o2);
        if (h != 0){
            if (h>0){
                System.out.println("p大于q");
            }else {
                System.out.println("p小于q");
            }
        }else if (w != 0){
            if (w>0){
                System.out.println("p大于q");
            }else {
                System.out.println("p小于q");
            }
        }else if (s != 0){
            if (s>0){
                System.out.println("p大于q");
            }else {
                System.out.println("p小于q");
            }
        }else if (k != 0){
            if (k>0){
                System.out.println("p大于q");
            }else {
                System.out.println("p小于q");
            }
        }else {
            System.out.println("p等于q");
        }
    }
}
