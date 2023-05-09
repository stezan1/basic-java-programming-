package lab3;

import java.util.Scanner;

public class sumavg {

	public static void main(String[] args) {
		int[]a= new int[5];
		int i,sum=0,avg=0;
		System.out.print("enter 5 elements : ");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		System.out.println("sum = "+sum);
		System.out.print("avg = "+avg);

	}

}
