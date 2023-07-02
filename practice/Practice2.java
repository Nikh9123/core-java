public class Practice2 {
    public int n = 4;

    void PrintStar(int n) {
        this.n = n;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practice2 p1 = new Practice2();
        p1.PrintStar(5);
    }
}
