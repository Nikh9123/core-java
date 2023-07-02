public class ExceptionHandle {

    public static void main(String arr[]) {
        try {
            int a = Integer.parseInt("1");
            int b = Integer.parseInt("0");
            int c = a / b;
            System.out.println("Result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Second number must be non-zero");
        }

        catch (NumberFormatException n) {
            System.out.println("Arguments must be Numeric");
        }

        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Invalid Number of arguments");
        }
        System.out.println(" remaining program");

    }
}
