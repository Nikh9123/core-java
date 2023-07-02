// package abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    protected static int nikhil()
    {
        
        return 0 ;
    }

    public abstract void sound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        System.out.println(dog.getName()); // Output: Tommy
        dog.sound(); // Output: Woof!
    }
}
