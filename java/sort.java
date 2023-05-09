package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		int[]a= new int[5];
		int i,l,s;
		System.out.print("enter 5 elements : ");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("array before sort is : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("sorted array is : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}

	}

}
