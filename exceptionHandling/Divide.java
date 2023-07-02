
public class Divide {
        public static void main(String arr[]) {
                try {
                        int a = Integer.parseInt(arr[0]);
                        int b = Integer.parseInt(arr[1]);
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

                int a = 9, b = 0;
                try {
                        int c = a / b;
                } catch (ArithmeticException e) {
                        System.out.println("error found");
                }
                System.out.println(" remaining program");

        }
}
