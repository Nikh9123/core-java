
public class ThisDemo {
    public ThisDemo() {
        this(10);
        System.out.println("First Constructor");
    }

    public ThisDemo(int a) // overloaded constructor
    {
        this(10, 20);
        System.out.println("Second Constructor");
    }

    public ThisDemo(int a, int B) // another overloaded constructor
    {
        this("Ravi Kant");
        System.out.println("Third Constructor");
    }

    public ThisDemo(String s) // and still another
    {
        System.out.println("Fourth Constructor");
    }

    public static void main(String args[]) {
        ThisDemo first = new ThisDemo();
    }
}
