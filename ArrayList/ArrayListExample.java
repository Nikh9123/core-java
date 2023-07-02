import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access elements by index
        System.out.println(numbers.get(0)); // Output: 10

        // Modify an element
        numbers.set(1, 25);

        // Remove an element
        numbers.remove(2);

        // Iterate over the ArrayList
        for (int number : numbers) {
            System.out.println(number);
        }

        ArrayList<Integer> marks = new ArrayList<>(2);
        // System.out.println(marks.);
        marks.add(1,34);

    }
}
