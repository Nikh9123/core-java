import java.util.*;
import java.io.*;

public class Demo {

    public static void main(String args[]) throws IOException {
        String fileName = "lines.txt";
        PrintWriter writer = null;
        File f1 = new File("lines.txt");
        f1.createNewFile();
        writer = new PrintWriter(fileName);
        // write something in file named "lines"
        for (int count = 1; count < 10; count++)
            writer.println("Line " + count);

        writer.append('z');
        writer.print("hello");
        writer.flush();
        writer.close();
        Scanner s = new Scanner(f1);
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }
}
