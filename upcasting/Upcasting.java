class Parent {
    static void m1() {
        System.out.println("From parent static m1()");
    }

    void m2() {
        System.out.println("From parent non-static(instance) m2()");
    }
}

class Child extends Parent {
    //@Override
    static void m1() {
        System.out.println("From child static m1()");
    }

    void m2() {
        System.out.println("From child non-static(instance) m2()");
    }
}

class Upcasting {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        obj1.m1(); // Upcasting(Implicit)
        obj1.m2();
        
        Child c1 = new Child();
        c1.m1();// method hiding
        c1.m2();
    }
}
