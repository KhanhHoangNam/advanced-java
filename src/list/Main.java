package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person(1);
        Person secondPerson= new Person(2);
        Person thirdPerson = new Person(3);

        List<Person> personList = new ArrayList<>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);
        personList.add(firstPerson);

        for (Person person : personList) {
            System.out.println(person.getId());
        }

        System.out.println("Finding a item via index");
        System.out.println(personList.get(0).getId());
        System.out.println(personList.get(2).getId());

        //Remove an item in a ArrayList;

        personList.remove(3);
        System.out.println("After removing a item");
        for (Person person : personList) {
            System.out.println(person.getId());
        }

    }
}
