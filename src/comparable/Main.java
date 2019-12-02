package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "KhanhHN"));
        people.add(new Person(5, "AnhPT"));
        people.add(new Person(3, "AnhPTQ"));
        people.add(new Person(2, "QuynhNT"));
        people.add(new Person(6, "LinhNTH"));

        System.out.println("=================Before sorting via id=================");
        for (Person person : people) {
            System.out.println(person.getId() + "=>" + person.getName());
        }

        System.out.println("=================After sorting via id=================");
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getId() + "=>" + person.getName());
        }

    }
}
