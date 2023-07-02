
// Manually allocate differing size second dimensions.
import java.util.Arrays;

class TwoDAgain {
    public static void main(String args[]) {
        // int twoD[][] = new int[4][];
        // twoD[0] = new int[1];
        // twoD[1] = new int[2];
        // twoD[2] = new int[3];
        // twoD[3] = new int[4];
        // int i, j, k = 0;
        // for (i = 0; i < 4; i++)
        // for (j = 0; j < i + 1; j++) {
        // twoD[i][j] = k;
        // k++;
        // }
        // for (i = 0; i < 4; i++) {
        // for (j = 0; j < i + 1; j++)
        // System.out.print(twoD[i][j] + " ");
        // System.out.println();
        // }

        // int a[] = new int[5];
        // System.out.println(a.getClass().getName());

        // // * clone() method in array*/
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] clonedArray = originalArray.clone();
        clonedArray[2] = 99;//updte only single array content 
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(clonedArray));

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;
        arr2[0] = 4; //update content of both arrays 
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        /**
         * *In this example, arr1 and arr2 both refer to the same array object in
         * memory.
         * *When we change the value of arr2[0], the change is reflected in arr1 as
         * well.
         * 
         * *To summarize, cloning an array creates a new, separate array *object with
         * the
         * *same content as the original array, whereas assigning one array variable to
         * *another creates two variables that refer to the same array *object in
         * memory.
         */

    }
}
