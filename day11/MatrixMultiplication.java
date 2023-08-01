import java.util.Scanner;

public class Matrix_addition {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		int n, m, i, j;
		System.out.println("Enter number of row : ");
		n = sc.nextInt();
		System.out.println("Enter number of column : ");
		m = sc.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] arr3 = new int[n][m];
		
		System.out.println("Enter first matrix");
		for (i = 0; i<n; i++) {
			for(j=0; j<m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix");
		for (i = 0; i<n; i++) {
			for(j=0; j<m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for (i = 0; i<n; i++) {
			for(j=0; j<m; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Addition matrix");
		for (i = 0; i<n; i++) {
			for(j=0; j<m; j++) {
				System.out.println(arr3[i][j]);
			}
		}
	}
}
