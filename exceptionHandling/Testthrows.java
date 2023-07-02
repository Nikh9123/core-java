import java.io.IOException;

public class Testthrows {
    void m() throws IOException {
        try {
            throw new IOException("device error");// checked exception
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    void n() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("Handle the exception...");
        }
    }

    void p() {
        n();
    }

    public static void main(String args[]) {
        Testthrows obj = new Testthrows();
        obj.p();
        System.out.println("normal flow...");
    }
}
