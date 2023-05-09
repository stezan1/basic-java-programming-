package lab3;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		//b. 0,2,4,10,20,30,40,.. nth
		
		
		int a=0,b=2,c=4,d=10,n;
		System.out.print(" enter number  of terms :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		for(int i=0;i<n-3;i++)
		{
			d=d+10;
			System.out.println(d);
		}

	}

}
