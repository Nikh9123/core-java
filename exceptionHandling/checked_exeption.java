import java.io.IOException;

public class checked_exeption {
    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();

    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");

        }
    }

    public static void main(String[] args) { // TODO Auto-generated method stub
        checked_exeption obj = new checked_exeption();
        obj.p();
        System.out.println("normal flow");
    }
}
