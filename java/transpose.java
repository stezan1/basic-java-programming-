package lab3;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {

		int[][]a= new int[3][3];
		int i,j;
		System.out.print("enter 5 elements : ");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
				{
		         a[i][j]=sc.nextInt();
				}
		}
		System.out.println("matrix before transpose is : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
				{
		         System.out.print("\t"+a[i][j]);
				}
			System.out.println();
		}
		
		
		System.out.println("matrix after transpose is : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
				{
		         System.out.print("\t"+a[j][i]);
				}
			System.out.println();
		}
		
		
		

	}

}
