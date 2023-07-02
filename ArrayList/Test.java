import java.util.ArrayList ;
/*
!{ IMPORT STATEMENTS }
!without import statements if we are using any methods or external predefine class we will get error : error: cannot find symbole error: cannot find symbol ArrayList l = new ArrayList<>();
* 
* either we use fully qualified line(eg : java.util.<className>)
* ArrayList is class which is present in java.util package
* But using fully qualified name is not permanent solution for longer programe when we need ArrayList , we need to write fully qualigied name every times 

todo : so using the predefine classes or methods we need to convey compilers whenever we need can you pls consider from java.util.package using {IMPORT STATEMENTS}
* when we use import statements we can use short names directly{ eg : ArrayList() }
? imports statements are Hardly recommended to use at top 

* import types : implicit and explicit 
* importing specific package is explicit import {eg : import java.util.ArrayList }
* importing all packages is implicit import 
* implicit import = import java.util.* ;
*/


public class Test {
    public static void main(String[] args) {

        // !it will give error : cannot find symbol
        // ArrayList l = new ArrayList<>();//* l is object of ArrayList class

        // *fully qualified name
        // java.util.ArrayList ar = new java.util.ArrayList<>();

        // ! using fully qualified name is never recommended , readbility is very bad
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();
        // java.util.ArrayList ar = new java.util.ArrayList<>();

        // //* after importing ArrayList class it will compile perfectly
        // ArrayList l = new ArrayList<>();
        student s = new student() ;
        s.m1();
    }
}
