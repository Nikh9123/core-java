
public class TestFinallyBlock1 {
    public static void main(String args[]) {
        try {
            int data = 25 / 0; // ArithmeticException occurs here
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
