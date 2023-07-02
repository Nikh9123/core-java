
import java.io.IOException;

public class dfasds {
    void m() {
        try {
            throw new IOException("device error");
        } catch (IOException e) {
            System.out.println("hello");
        }
    }

    void n() {
        m();
    }

    void p() {
        n();
    }

    public static void main(String[] args) { 
        // TODO Auto-generated method stub
        checked_exeption obj = new checked_exeption();
        obj.p();
        System.out.println("normal flow");
    }
}
