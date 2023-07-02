public class VarLenArg {
    static void fun(int... a) {
        System.out.println("Numbers of arguments passed = " + a.length);
    }

    //void method(int... gfg, String q) { // Compile time error as vararg // appear before normal argument }

    //void method(String... gfg, int... q) { // Compile time error as there // are two varargs }

    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);

        fun();

        int x[] = { 1, 2, 3, 4, 5, 6 };
        fun(x);
    }
}
