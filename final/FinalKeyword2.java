class A {
    final void m1() {
        System.out.println("This is a final method.");
    }
}

class B extends A {
    // void m1() {
    //     // Compile-error! We can not override
    //     System.out.println("Illegal!");
    // }
    final int a ;
    public static void main(String[] args) {
        final int a ;
    }
}