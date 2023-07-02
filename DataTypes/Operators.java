
public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        // int a = 4;
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        // int b = 9;
        // b *= 3;
        // System.out.println(b);

        // 3. Comparison Operators
        // System.out.println(64<6);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        System.out.println(64 > 5 || 64 > 98);

        // 5. Bitwise Operators
        System.out.println(2 & 3);
        // 10
        // 11
        // ----
        // 10

        // ? brainstromes
        // byte b = 30; System.out.println(~b);
        // byte b = -53; System.out.println(~b);
        // System.out.println(34 >> 3);
        // System.out.println(-34 >> 3);// positive shifting krne ke baad 1 badha do aur
        // minus ka sign laga do
        // System.out.println(-34 >>> 3);

        // int x = 10, y = 5;
        // while (x-- > 7 || ++y < 8) {
        // System.out.println(x + " and " + y);
        // }
        // System.out.println("ans is :");
        // System.out.println(x + " and " + y);

        // System.out.print(2>89||4>87?false:true);

        System.out.print(2 > 1 || 4 > 3 ? false : true);
        class X {
        }
        class Y extends X {
        }
        class Z extends Y {
        }

        X x1 = new Y();
        Y y1 = new Z();
        Y y2 = new Y();
        System.out.println(x1 instanceof X);
        System.out.println(x1 instanceof Z);
        System.out.println(y1 instanceof Z);
        System.out.println(y2 instanceof X);

    }
}
