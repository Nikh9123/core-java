public class ContinuseDemo {
    public static void main(String[] rk) {
        outer: for (int i = 0; i < 3; i++) {
            inner: for (int j = 0; j < 3; j++) {
                System.out.println("i= " + i + ", " + "j= " + j);
                if (j == 2) {
                    System.out.println("break encounterd");
                    break inner;
                }
                if (i == j) {
                    System.out.println("continue encounterd:");
                    continue outer;
                }
                System.out.println("Bye");
            }
        }
    }

}
