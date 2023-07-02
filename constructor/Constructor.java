public class Constructor {
    public Constructor() {
        this(10);
        System.out.println("First Constructor");
    }

    public Constructor(int a) // overloaded constructor
    {
        this(10, 20);
        System.out.println("Second Constructor");
    }

    public Constructor(int a, int B) // another overloaded constructor
    {
        this("Ravi Kant");
        System.out.println("Third Constructor");
    }

    public Constructor(String s) // and still another
    {
        System.out.println("Fourth Constructor");
    }

    public static void main(String args[]) {
        Constructor first = new Constructor();
    }
}
