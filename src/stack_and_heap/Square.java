package stack_and_heap;

public class Square {
    private void perimeter() {
        System.out.println("Perimeter");
    }
    private static void hello(Square square) {
        final String HELLO = "hello everyone";
        System.out.println(HELLO);
        square.perimeter();
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);

        Square square = new Square();
        hello(square);
    }
}
