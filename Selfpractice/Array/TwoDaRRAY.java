package Array;
import java.util.*;
public class TwoDaRRAY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ENTER THE NO OF ROWS U WANT = ");
		int rows = sc.nextInt();
		System.out.println("ENTER THE NO OF COLUMNS U WANT = ");
		int columns = sc.nextInt();
		
		int[][] numbers = new int[rows][columns];
		
		for(int i=0 ; i<rows; i++) {
			for (int j=0; j<columns ; j++) {
				System.out.printf("Enter the element [%d][%d] =  \n",i,j);
				numbers[i][j] = sc.nextInt();
			}
		}
		
//		for(int i=0 ; i<rows; i++) {
//			for (int j=0; j<columns ; j++) {           
//				System.out.printf("Enter the element [%d][%d] = %d \n",i,j,numbers[i][j]);
//			}
//		}
//		
//		
//		System.out.println("Printing an elemets of an 2D Array in Matrics");
//		for(int i=0 ; i<rows; i++) {
//			for (int j=0; j<columns ; j++) {
//				System.out.print(numbers[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		System.out.println("Enter the element u want to search in Matrics");
		int find = sc.nextInt();
		for(int i=0 ; i<rows; i++) {
			for (int j=0; j<columns ; j++) {    
				if(numbers[i][j]==find) {
					System.out.printf("THE ELEMENT %d IS LOCATED AT [%d][%d]",find ,i,j);
				}
				System.out.println();
			}
		}
	}
		
		
	}

