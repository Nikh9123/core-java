// package functionalInterface;
// @FunctionalInterface
interface friend {
    void show(String nikhi);
    // void print();
}
@FunctionalInterface
interface girl extends friend {
    void show();
}

// interface sayable
// {
// void say(String msg);
// }
// @FunctionalInterface
// interface Doable extends sayable
// {
// void doIt();
// }

// interface nikhi{
// void ma(String nif);
// }

// @FunctionalInterface
// interface addu extends nikhi{
// void jh();
// }

public class code {
    public static void main(String[] args) {
        friend a = () -> System.out.println("in interface show function");
        a.show();
    }
}
