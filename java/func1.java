package lab3;

import java.util.Scanner;

public class func1 {
	//wap to find the fibonacci series using function
	public static void fibo()
	{
		int i,a=0,b=1,c=0,n;
		System.out.print("enter series : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.print("\t"+a);
		System.out.print("\t"+b);
		for(i=0;i<n;i++)
		{
			c=a+b;
			System.out.print("\t"+c);
			a=b;
			b=c;
		}
	}
	
	
	
	
	//wap to find the factorial of number 
	public static void fact()
	{
		int i,a,f=0;
		System.out.print("enter a number : ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a<=1)
		{
			System.out.print("1");
		}
		else 
		{
		    for(i=1;i<=a;i++)
		   {
			    f=f*i;
		   }
		}
		System.out.print("factorial of "+a+" is "+f);
	}
	
	
	//wap to check whether the number is prime or composite
	//wap to find the sum of first 10 natural number using function

	public static void main(String[] args) {
		fibo();
		//fact();

	}

}
