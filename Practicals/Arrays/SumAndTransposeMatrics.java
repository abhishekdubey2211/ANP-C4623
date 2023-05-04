package TwoDArray;

import java.util.Scanner;

public class SumAndTransposeMatrics 
{	
	public static void main(String[] args) {
		//getting row and column size
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of an row in matrics = ");
		int rsize = sc.nextInt();
		System.out.println("Enter the size of an column in matrics = ");
		int csize = sc.nextInt();
		
		//craating an 2d array
		int[][] matrics = new int[rsize][csize];
		//craating an second 2d array
		int[][] matrics1 = new int[rsize][csize];
		int[][] summatric = new int[rsize][csize];
		
		
		
		//inputs for  an 2d array of matrics
		System.out.println("\n input values for matrics 1 \n");
		for(int i=0 ; i<matrics.length ; i++) 
		{
			for(int j=0 ; j<matrics.length ; j++) 
			{
				matrics[i][j] = sc.nextInt();
			}
		}
		
		//output of an 2d array of matrics
		System.out.println("\n Printing an matrics 1\n");
		for(int i=0 ; i<matrics.length ; i++) 
		{
			for(int j=0 ; j<matrics.length ; j++) 
			{
				System.out.print(matrics[i][j]+" ");
			}
			System.out.println();
		}
		
		//transpose matrics
		System.out.println("\n Printing an transpose for matrics 1\n");
		for(int i=0 ; i<matrics.length ; i++) 
		{
			for(int j=0 ; j<matrics.length ; j++) 
			{
				System.out.print(matrics[j][i]+" ");     //[j][i]
			}
			System.out.println();
		}
				
		//inputs for  an 2d array of matrics
				System.out.println("\n input values for matrics 2  \n");
				for(int i=0 ; i<matrics1.length ; i++) 
				{
					for(int j=0 ; j<matrics1.length ; j++) 
					{
						matrics1[i][j] = sc.nextInt();
					}
				}
		//output of an 2d array of matrics
				System.out.println("\n Printing second matrics 2\n");
				for(int i=0 ; i<matrics1.length ; i++) 
				{
					for(int j=0 ; j<matrics1.length ; j++) 
					{
						System.out.print(matrics1[i][j]+" ");
					}
					System.out.println();
				}
		//transpose matrics
				System.out.println("\n Printing transpose for second matrics 2\n");
				for(int i=0 ; i<matrics1.length ; i++) 
				{
					for(int j=0 ; j<matrics1.length ; j++) 
					{
						System.out.print(matrics1[j][i]+" ");   //[j][i]
					}
					System.out.println();
				}
				
		//adding two matrics
				System.out.println("\n printing sum of matric 1 andd matric 2");
				for(int i=0 ; i<summatric.length ; i++) 
				{
					for(int j=0 ; j<summatric.length ; j++) 
					{
						summatric[i][j] = matrics1[i][j]+matrics[i][j];
						System.out.print(summatric[i][j]+"  ");
					}
					System.out.println(" ");
					}
					}
}
				
