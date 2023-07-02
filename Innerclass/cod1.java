// package Innerclass;
class a{
    int a ;
    void print()
    {
        System.out.println("outer class");
    }

    class b{

        void printf()
        {
            System.out.println("inner");
        }
    }
    static class c {
        void config()
        {
            System.out.println("in static inner class");
        }
    }
}
public class cod1 {
    public static void main(String[] args) {
        a ob1 = new a();
        
        a.b ob2 = ob1.new b();
        ob2.printf();

        a.c ob3 = new a.c();
        ob3.config();
    }
}
