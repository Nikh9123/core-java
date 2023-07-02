import java.util.Arrays;
public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte age = 25;
        short distance = 5000;
        int population = 1000000;
        long largeNumber = 1234567890L;
        float temperature = 23.5f;
        double pi = 3.14159;
        boolean isRaining = true;
        char grade = 'A';

        System.out.println("Age: " + age);
        System.out.println("Distance: " + distance);
        System.out.println("Population: " + population);
        System.out.println("Large Number: " + largeNumber);
        System.out.println("Temperature: " + temperature);
        System.out.println("Pi: " + pi);
        System.out.println("Is Raining: " + isRaining);
        System.out.println("Grade: " + grade);

        // Reference Data Types
        String name = "John";
        int[] numbers = {1, 2, 3, 4, 5};
        MyClass obj = new MyClass();

        System.out.println("Name: " + name);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Object: " + obj);
    }
}

class MyClass {
    // Implementation of MyClass
}
