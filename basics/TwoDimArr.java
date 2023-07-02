import java.util.Scanner;

class TwoDimArr {
	public static void main(String args[]) {
		// int twoD[][]= new int[4][5];
		// int i, j, k = 0;
		// for(i=0; i<4; i++)
		// for(j=0; j<5; j++)
		// {
		// twoD[i][j] = k;
		// k++;
		// }
		// for(i=0; i<4; i++)
		// {
		// for(j=0; j<5; j++)
		// System.out.print(twoD[i][j] + " ");
		// System.out.println();
		// }
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][5];
		int k = 0;
		System.out.println("Enter array elements:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
