// Abstract class
abstract class Sunstar {
    abstract void printInfo();

    void printOutput() {
    };
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

    void printOutput() {
        System.out.println("hello non abstract method can be declared in subclass");
    }

}

// Base class
class AbstractDemo {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        s.printInfo();
        s.printOutput();
    }
}
