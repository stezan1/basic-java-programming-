package lab2;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int fact=1,i,sum=1;
		System.out.print("enter any number : ");
		Scanner sc = new Scanner(System.in);
		fact=sc.nextInt();
		for(i=1;i<=fact;i++)
		{
	       sum=sum*i;
		}
		System.out.print("fact = "+sum);

	}

}
