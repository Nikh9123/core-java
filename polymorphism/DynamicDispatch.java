class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        // Animal animal1 = new Dog();
        // Animal animal2 = new Cat();

        // animal1.makeSound(); // Output: Dog is barking
        // animal2.makeSound(); // Output: Cat is meowing
    
        Animal a1 = new Animal() ;
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        Animal r1 ;

        r1 = a1 ;
        r1.makeSound();

        r1=a2 ;
        r1.makeSound();

        r1 = a3 ;
        r1.makeSound();

    }
}
