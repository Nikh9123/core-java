public class ExceptionHand {

    // Rule: By default Unchecked Exceptions are forwarded in calling chain
    // (propagated).

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exceptionhandled");
        }
    }

    public static void main(String args[]) {
        ExceptionHand obj = new ExceptionHand();
        obj.p();
        System.out.println("normal flow...");
    }
}
