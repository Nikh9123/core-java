
public class Basic1 {
    {
        System.out.println("Welcome to LPU");
    }

    public Basic1() {

        System.out.println("Basic1 constructor");
    }

    public Basic1(int a) {

        System.out.println("Basic1 parameter constructor");
    }

    public static void main(String[] aa) {
        System.out.println("main block");
        Basic1 obj = new Basic1();
        Basic1 obj1 = new Basic1(3);
    }
}
