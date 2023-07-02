// package Strings;

public class indexofDemo {
    public static void main(String args[]) {
        // String s = "Now is the time for all good men " +
        // "to come to the aid of their country.";
        // System.out.println(s);
        // System.out.println("indexOf(t) = " + s.indexOf('t'));
        // System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        // System.out.println("indexOf(the) = " + s.indexOf("the"));
        // System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        // System.out.println("indexOf(t, 10) = " + s.indexOf('t', 10));
        // System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf('t', 60));
        // System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        // System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));
        // String s = "ABCDEFG";

        // String t = s.substring(2);
        // System.out.println(t);
        // String u = s.substring(1, 4);
        // System.out.println(u);
        // // s.trim(2);
        // String sb = "Hello world".trim();
        // System.out.println(sb);

        String str = "have-fun-in-java@blogspot@in";
        String[] s = str.split("-", -2);
        for (String x : s)
            System.out.println(x);

    }
}
