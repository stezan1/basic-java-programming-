package lab3;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		double a,b,sum,mul,div,pow,sub;
		int choice;
		System.out.print("enter a and b : ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("\n1.sum\n2.sub\n3.mul\n4.div\n5.pow");
		System.out.print("enter ur choice :");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			sum=a+b;
			System.out.print("sum ="+sum);
			break;
		case 2:
			sub=a-b;
			System.out.print("sub ="+sub);
			break;
		case 3:
			mul=a*b;
			System.out.print("mul ="+mul);
			break;
		case 4:
			div=a/b;
			System.out.print("div ="+div);
			break;
		case 5:
			pow= Math.pow(a, b);
			System.out.print("pow ="+pow);
			break;
		default:
			System.out.print("invalid choice ");
			break;
		
		}

	}

}
