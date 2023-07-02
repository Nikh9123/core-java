// package constructot;

public class Cube1 {
    int length, breadth, height;

    protected Cube1() {
        length = 10;
        breadth = 10;
        height = 10;
    }

    Cube1(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    final double volume() {
        return breadth * height * length;
    }

    public static void main(String[] args) {
        Cube1 c1 = new Cube1();
        Cube1 c2 = new Cube1(10, 20, 30);
        System.out.println("Volume of Cube1 is : " + c1.volume());
        System.out.println("Volume of Cube1 is : " + c2.volume());
    }
}

class nikhil extends Cube1{
double volume(){

}
}
