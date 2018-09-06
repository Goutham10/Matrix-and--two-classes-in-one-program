package twodimensionalArrays;

import java.util.Scanner;

public class MatrixMulAlternate {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter the size of row: ");
		int a=obj.nextInt();
		System.out.println(" enter the size of column : ");
		int b=obj.nextInt();
		System.out.println(" enter the elements : ");
		int A[][]=new int [a][b];
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<=b;j++)
			{
				A[i][j]=obj.nextInt();
			}
		}
		System.out.println(" the first matrix is :");
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<=b;j++)
			{
				System.out.println(A[i][j]);
			}
		}
		
}
}
