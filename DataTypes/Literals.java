public class Literals {
    public static void main(String[] args) {
        byte age = 34;
        int age2 = 56;
        short age3 = 87;
        long ageDino = 5666666666666L;
        char ch = 'A';
        float f1 = 5.6f;
        double d1 = 4.66;
        int f2 = 0546; // octal representation
        System.out.println("f2 = " + f2);
        boolean a = true;
        System.out.print(age);
        String str = "Harry";
        System.out.println(str);
        int f3 = 0x488add;
        System.out.println("f3 = " + f3);
        char c = '4';
        // short f = (short)c ;
        // short g = c ;
        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        System.out.println("i is " + i); // i is 101
        int j = 2 + 'a'; // (int)'a' is 97
        System.out.println("j is " + j); // j is 99
        System.out.println(j + " is the Unicode for character " + (char) j);
        System.out.println("Chapter " + '2');

    }
}
