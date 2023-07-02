// package Strings;

import java.util.Arrays;

class StringDemo {
    public static void main(String args[]) {
        // String strOb1 = "Ravi";
        // String strOb2 = "LPU";
        // String strOb3 = strOb1 + " and " + strOb2;
        // System.out.println(strOb1);
        // System.out.println(strOb2);
        // System.out.println(strOb3);

//         char[] a = { 'c', 'o', 'n', 'g', 'r', 'a', 't', 's' };
//         byte[] b = { 82, 65, 86, 73, 75, 65, 78, 84 };
// //                   R   a   v   i   k   a    n   t
//         String s1 = new String(a);
//         System.out.println(s1);

//         String s2 = new String(a, 2, 5);
//         System.out.println(s2);

//         String s3 = new String(s1);
//         System.out.println(s3);

//         String s4 = new String(b);
//         System.out.println(s4);

//         String s5 = new String(b, 4, 4);
//         System.out.println(s5);

// String s1 = "one"; 
// String s2 = s1.concat(" two");
//        System.out.println(s2.charAt(0));
//        // char ab[] = s1.toCharArray() ;
   
//        String s = "india" ;
//        char c[] = s.toCharArray() ;
//        System.out.println(Arrays.toString(c));



String s = "KAMAL";
		     char b[] = new char [10];	
		     b[0] = 'N';	 b[1] = 'E';
		     b[2] = 'E';     b[3] = 'L';
		     s.getChars(1, 3, b, 2);
		     System.out.println(b);

    }
}
