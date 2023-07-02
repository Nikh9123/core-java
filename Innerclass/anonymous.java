// package Innerclass;
class A {
    public void show() {
        System.out.println("outer class");
    }

}

public class anonymous {
    public static void main(String[] args) {
        A ob = new A() {
            //inner anonymous class
            public void show() {
                System.out.println("anonymous class");
            }
        };
        ob.show();
    }
}
