package objects;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person(1, "KhanhHN");
        Person secondPerson = new Person(2, "KhanhHN");

        System.out.println(firstPerson.equals(secondPerson));
    }
}
