// package interface;

public class interface Printable {
    void print();
    void scan();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing...");
    }
    // Error: The class must provide implementation for all interface methods
    // public void scan() {}
}

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        printer.print();
    }
}
