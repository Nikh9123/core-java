package Arrays;
import java.util.Scanner;;

public class ArraysDemo2 {
    static private int noOfSubjects;
    static private double result = 0;
    static private int[] arr;

    void DataInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subject :");
        noOfSubjects = sc.nextInt();
        arr = new int[noOfSubjects];
        System.out.println("enter the marks of student :");
        for (int i = 0; i < noOfSubjects; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return;
    }

    static double calculatePercentage() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        result = sum / (100 * noOfSubjects) * 100;
        return result;
    }

    public static void main(String[] args) {
        ArraysDemo2 student1 = new ArraysDemo2();
        student1.DataInput();
        System.out.println("your student result is " + calculatePercentage());
    }
}
