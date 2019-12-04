package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "KhanhHN"));
        personList.add(new Person(5, "AnhPT"));
        personList.add(new Person(3, "AnhPTQ"));
        personList.add(new Person(2, "QuynhNT"));
        personList.add(new Person(6, "LinhNTH"));

        System.out.println("=============Before sorting=============");
        for (Person person: personList) {
            System.out.println(person.getId() + "=>" + person.getName());
        }

        System.out.println("=============Before sorting=============");
        personList.sort(new MyCompare());
        for (Person person: personList) {
            System.out.println(person.getId() + "=>" + person.getName());
        }
    }
}

class MyCompare implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() == o2.getId()) {
            return 0;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        }
        return -1;
    }
}
