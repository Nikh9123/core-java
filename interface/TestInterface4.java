interface Printable {
    int data = 40;

    void print();

    // void show();
}

public class TestInterface4 implements Printable {
    int data = 330;

    public void print() {
        System.out.println("Data: " + data);
    }

    public static void main(String args[]) {
        Printable obj = new TestInterface4();
        obj.print();
    }
}
