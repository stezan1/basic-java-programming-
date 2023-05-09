package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		//wap to find the smallest and largest element in an array
		//wap to sort the array element in ascending and escending
		//wap to find the sum and average 

		int[]a= new int[5];
		int i,l,s;
		System.out.print("enter 5 elements : ");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		s=a[0];
		l=a[4];
		System.out.println("the smallest number is : "+s);
		System.out.println("the largest number is : "+l);
	}

}
