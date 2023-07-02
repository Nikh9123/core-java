class BreakDemo{
  public static void main(String [] rk)
 {
    outer1:	
   for(int i=0; i<3; i++){
     System.out.println("Outer "+ i);
     inner1:
           for(int j=0; j<3; j++)
       {
            System.out.println("Inner "+j);
            if(i== j+1)
               break inner1;		   
            System.out.println("Bye");	
       }
     }
}
}
