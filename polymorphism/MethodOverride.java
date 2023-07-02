package polymorphism;

class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    // This method overrides show() of Parent
    void show() {
        System.out.println("Child's show()");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        // Parent obj2 = new Child();
        Parent p1 = new Parent();
        p1.show();
        Child obj2 = new Child();
        obj2.show();
    }
}
