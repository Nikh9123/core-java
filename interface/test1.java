interface A{
    abstract void test() ;
}
interface b{

}

class parent {
    parent() {
        System.out.println("parent");
    }
}

public class test1 extends parent {
    test1() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        test1 t1 = new test1();

    }
}
