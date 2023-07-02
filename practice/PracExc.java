public class PracExc {
    public static double area(int r) {
        double area = 0f ;
        area = Math.PI * r*r ;
        return area;
    }
    public static int divide(int args1 , int args2) throws ArithmeticException {
        int result = 0 ;
        result = args1/args2 ;
        return result ;
    }
    public static void main(String[] args) {
        try {
            divide(2,0 ) ;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("exception handled");
        }
    }
}
