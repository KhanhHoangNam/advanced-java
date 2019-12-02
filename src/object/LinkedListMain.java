package object;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        Person person = new Person(1, "Nam Khanh");
        List<Person> people = new LinkedList<>();
        people.add(person);

        for (Person person1 : people) {
            System.out.println(person1.getId() + "---" + person1.getName());
        }
    }
}
