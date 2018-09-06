package twodimensionalArrays;

import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) 
	{
		int i,j;
		Scanner obj= new Scanner(System.in);
		System.out.println(" Matrix one ");
		System.out.println(" enter the row size : ");
		int n = obj.nextInt();
		System.out.println(" enter the column size : ");
		int m = obj.nextInt();
		int a[][]=new int[n][m];
		System.out.println(" enter row and column elements : ");
		for(i=0 ;i<n;i++)
		{
			for( j=0;j<m;j++)
			{
			a[i][j]=obj.nextInt();
			}
		}
		for(i=0 ;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" Matrix two ");
		System.out.println(" enter the row size : ");
		int n1 = obj.nextInt();
		System.out.println(" enter the column size : ");
		int m1 = obj.nextInt();
		int b[][]=new int[n1][m1];
		System.out.println(" enter row and column elements : ");
		for( i=0 ;i<n;i++)
		{
			for( j=0;j<m;j++)
			{
			b[i][j]=obj.nextInt();
			}
		}
		for( i=0 ;i<n;i++)
		{
			for( j=0;j<m;j++)
			{
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" Multiplication of Matrix one & Matrix two : ");
		int mul[][]=new int [n][m];
		

		for(i=0;i<mul.length;i++)
		{
			for( j=0;j<mul[i].length;j++)
			{
				 for (int k = 0; k < n; k++)
	                {
	                    mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
	                }
			}
		}
		for(i=0;i<n;i++)
		{
			for( j=0;j<m;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();

		}

	}

}
