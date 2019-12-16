package test;

public class TestDemo {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        Student student = new Student("Nam Khanh");
        System.out.println("After calling change1 method " + student.getName());
        testDemo.change1(student);
        System.out.println("Before calling change1 method " + student.getName());

        System.out.println("After calling change2 method " + student.getName());
        testDemo.change2(student);
        System.out.println("Before calling change2 method " + student.getName());

    }

    private void change1(Student student) {
        student = new Student();
    }

    private void change2(Student student) {
        student.setName("KhanhHN");
    }
}
