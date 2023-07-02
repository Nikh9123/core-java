import java.util.*;
public class switchTest {
    public static void main(String[] args) {

        // for (int i = 0; i < 5; i++)
        //     switch (i) {
        //         case 0:
        //             System.out.println("i is zero.");
        //             break;
        //         case 1:
        //             System.out.println("i is one.");
        //             break;
        //         case 2:
        //             System.out.println("i is two.");
        //             break;
        //         default:
        //             System.out.println("i is greater than 2.");
        //     }
        // outer:
        // for(int i=0; i<3; i++){
		// 	System.out.println("Outer "+ i);
		// 	inner:
		//     		for(int j=0; j<3; j++)
		// 		{
		// 	   		System.out.println("Inner "+j);
		// 	   		if(i== j+1)
		// 	 		     break outer ;		   
		// 	   		System.out.println("Bye");	
		// 		}
		//   	}
        String str = "she saw a ship in the sea"; 
		int size = str.length();
 		int count = 0; 
		for (int i = 0; i < size; i++) 
		    { 
			if (str.charAt(i) != "s") 	
			     continue;
			count++; 
		    } 
		System.out.println("Number of s in "+ str + " = "+ count); 
        int arr[]= {1,2,3,54,5};
        int arr1[] ;
        arr1 = {3,45,6,89};
    }

}
