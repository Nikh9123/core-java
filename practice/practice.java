class practice {
    static private int x;

    void display(int x) {
        this.x = x;
        System.out.println(x);
    }

    public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result%.2f);

        // int x=130;
        // byte b =(byte)x ;
        // System.out.println(b);

        // double d=136.34;
        // byte b =(byte)d ;
        // System.out.println(b);

        // float a = 3.14f;
        // int x = (int) a;
        // System.out.println(x);

        // int i = 132;
        // short s = 15;
        // byte b = (byte) i;
        // int x = b + s;
        // System.out.println(x);

        // double d = 65.25;
        // char c = (char) d;
        // System.out.println(c);

        // int i = 50000;
        // short s = (short) i;
        // System.out.println(s);

        // byte b = 123;
        // short s = 999;
        // s = b; // implicit conversion
        // System.out.println(s);

        // byte b = 123;
        // short s = 999;
        // b = s; // explicit conversion //error
        // System.out.println(b);

        // int i = 50;
        // char c = (char) i;
        // System.out.println("hello world " + c);

        // int i = 50;
        // char c = (char) i;
        // short s;
        // s = (short) c;
        // System.out.println(c + s + "hello world " + c + s);

        practice p1 = new practice();
        p1.display(20);

    }
}
