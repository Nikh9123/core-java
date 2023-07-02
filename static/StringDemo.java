import java.lang.reflect.Array;
import java.util.Arrays;

class StringDemo {
    public static void main(String args[]) {
        // String strOb1 = "Ravi";
        // String strOb2 = "LPU";
        // String strOb3 = strOb1 + " and " + strOb2;
        // System.out.println(strOb1);
        // System.out.println(strOb2);
        // System.out.println(strOb3);

        // char[] a = { 'c', 'o', 'n', 'g', 'r', 'a', 't', 's' };
        // byte[] b = { 82, 65, 86, 73, 75, 65, 78, 84 };

        // String s1 = new String(a);
        // System.out.println(s1);

        // String s2 = new String(a, 2, 5);
        // System.out.println(s2);

        // String s3 = new String(s1);
        // System.out.println(s3);

        // String s4 = new String(b);
        // System.out.println(s4);

        // String s5 = new String(b, 4, 4);
        // System.out.println(s5);

        // char chars[] = { 'a', 'b', 'c' };
		// String s = new String(chars);
		// System.out.println(s.length());

        // String name = "Nikhil" ;
        // String lastName = "SATYAM";

        // name = name.concat(lastName);
        // System.out.println(name);
        // System.out.println(name.charAt(2));

        // char arr[] = name.toCharArray() ;
        // System.out.println(Arrays.toString(arr));

        // String s = "KAMAL";
		//      char b[] = new char [10];	
		//      b[0] = 'N';	 b[1] = 'E';
		//      b[2] = 'E';     b[3] = 'L';
		//      s.getChars(1, 3, b, 2);
		//      System.out.println(b);
        
        String s = "KAMAL" ;
        String v = "kamal" ;

        // System.out.println(s.equals(v));
        // System.out.println(s.equalsIgnoreCase(v));
        System.out.println(s.endsWith("AL"));
        System.out.println(v.startsWith(v, 0));

    }
}