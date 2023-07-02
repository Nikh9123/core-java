public class Exeception1 {

  public static void main(String arr[]) {
    try {
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int c = a / b;
      System.out.println("Result is: " + c);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("2nd number must not be zero");
    } catch (Throwable e) {
      System.out.println(e);
    }
  }
}
