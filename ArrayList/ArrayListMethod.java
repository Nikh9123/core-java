// Java Program to Change elements in ArrayList

// Importing all utility classes
import java.util.*;

// main class
class ArrayListMethod {

    // Main driver method
    public static void main(String args[]) {
        // Creating an Arraylist object of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to Arraylist
        // Custom input elements
        al.add("Geeks");
        al.add("Geeks");

        // Adding specifying the index to be added
        al.add(1, "Geeks");

        // Printing the Arraylist elements
        System.out.println("Initial ArrayList " + al);

        // Setting element at 1st index
        al.set(1, "For");

        // Printing the updated Arraylist
        System.out.println("Updated ArrayList " + al);

        // Using the Get method and the
        // for loop
        // for (int i = 0; i < al.size(); i++) {

        //     System.out.print(al.get(i) + " ");
        // }

        System.out.println();

        // Using the for each loop
        // for (String str : al)
        //     System.out.print(str + " ");

        ArrayList<Integer> list = new ArrayList();
        // add the number
        list.add(9);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // get method
        Integer n = list.get(1);
        int ans = list.indexOf(n);
        System.out.println("at indext 1 number is:" + n+" " + ans);
        // list.add(1);
        // list.add(2);
        // list.add(4);
        // System.out.println(list);
        // insert missing element 3
        list.add(2, 3);
        System.out.println(list);
    
        int b = list.size();
        System.out.println("The size is :" + b);
    
    
    
    
    
    
    
    
    }
}
