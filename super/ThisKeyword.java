public class ThisKeyword {
    int a;
    int b;

    ThisKeyword(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public static void main(String[] args) {
        ThisKeyword td = new ThisKeyword(100, 500);
        ThisKeyword td1 = new ThisKeyword(400, 220);

        System.out.println(td.a + " " + td.b);
        System.out.println(td1.a + " " + td1.b);
    }
}
