package comparable;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.id) {
            return -1;
        } else if (this.id == o.id) {
            return 0;
        }
        return 1;
    }
}
