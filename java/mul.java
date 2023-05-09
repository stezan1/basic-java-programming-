package lab3;

import java.util.Scanner;

public class mul {
    //wap for multiplication of two matrix 
	public static void main(String[] args) {
		int[][]a= new int[2][2];
		int[][]b= new int[2][2];
		int[][]mul= new int[2][2];
		int i,j;
		System.out.print("enter elements of 1st matrix : ");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
				{
		         a[i][j]=sc.nextInt();
				}
		}
		System.out.print("enter elements of 2st matrix : ");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
				{
		         b[i][j]=sc.nextInt();
				}
		}
		System.out.println(" 1st matrix  is : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
				{
		         System.out.print("\t"+a[i][j]);
				}
			System.out.println();
		}
		System.out.println(" 2nd matrix  is : ");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
				{
		         System.out.print("\t"+b[i][j]);
				}
			System.out.println();
		}
		System.out.println("multiplication of 1st and 2nd matrix is : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				{
		         mul[i][j]=a[i][j]*b[i][j];
				}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
				{
				System.out.print("\t"+mul[i][j]);
				}
			System.out.println();
		}
		
		
	}

}
