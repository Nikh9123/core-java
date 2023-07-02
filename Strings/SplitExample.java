// package Strings;

public class SplitExample {
    public static void main(String[] args) {
        String text = "Hello, World! How are you today?";
        
        // Splitting the string by space
        String[] words = text.split(" ");
        
        // Printing each word from the array
        for (String word : words) {
            System.out.println(word);
        }
        
        // Splitting the string by comma
        String[] parts = text.split(",");
        
        // Printing each part from the array
        for (String part : parts) {
            System.out.println(part);
        }
    }
}

