package Arrays;
import java.util.Scanner;
// import java.lang.Double;
// import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPrac {
    public static void main(String[] args) {
        double[] roll_no;
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array :");
        size = sc.nextInt();
        roll_no = new double[size];
        for (int i = 0; i < size; i++) {
            roll_no[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(roll_no));

        int newArr[] = new int[size];
        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = (int) roll_no[i];
        }
        sc.close();
        System.out.println(Arrays.toString(newArr));
    }
}
