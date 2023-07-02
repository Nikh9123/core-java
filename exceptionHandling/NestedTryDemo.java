public class NestedTryDemo {
    public static void main(String args[]){
       try {
          int a = 1 ;//Integer.parseInt(args[0]);
          try {
                   int b =0; // Integer.parseInt(args[1]);
                   System.out.println(a/b);
                } 
         catch (ArithmeticException e) 
                {
           System.out.println("Div by zero error!");
                      }
            } 
   catch (ArrayIndexOutOfBoundsException r) {
                System.out.println("Need 2 parameters!");
     }
System.out.println(" remaining program");
  }
}
