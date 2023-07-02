import java.io.File;

public class code1 {
    public static void main(String[] args) {
        File f = new File("nikhil.txt") ;
        System.out.println(f.canWrite());
        System.out.println(f.lastModified());
    }
}
