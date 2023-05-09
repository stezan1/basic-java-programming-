package lab2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	
		int a;
		System.out.print("enter any number : ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
			if(a%2==0)
			{
				System.out.println("composite ");
			}
			else
			{
				System.out.print("prime");
			}
		
	}
}
