package lab3;

import java.util.Scanner;

public class new1 {

	public static void main(String[] args) {
		//wap to print the following series 
		//a. 0,1,1,2,3,5,8,.....nth
		//b. 0,2,4,10,20,30,40,.. nth
		
	
		
		int a=0,b=1,c=0,n;
		System.out.print(" enter number  of terms :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
