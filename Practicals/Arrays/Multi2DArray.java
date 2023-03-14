package corejava;
import java.util.Scanner;

public class Multi2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS OF ROW : ");
		int r = sc.nextInt();
		
		System.out.println("ENTER THE NUMBERS OF COLUMN : ");
		int c = sc.nextInt();
		
		int[][] arre = new int[r][c];
		System.out.println("Enter the value of an Array : ");
		
		for(int i=0 ; i<r ; i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("Enter the values for elements(%d,%d):",i,j);
				arre[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Array is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) 
			{
				System.out.print(arre[i][j]+"  ");
			}
			System.out.println();
		}

		for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += arre[i][j];
            }
            System.out.printf("Sum of row %d: %d\n", i+1, rowSum);
        }

		for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += arre[i][j];
            }
            System.out.printf("Sum of column %d: %d\n", j + 1, colSum);
        }

        // Close the Scanner object
        sc.close();
    }
}
	