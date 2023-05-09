package lab1;

import java.util.Scanner;

public class odd_even{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("enter any number : ");
	    Scanner scan= new Scanner(System.in);
	    a=scan.nextInt();
	    if(a%2==0)
	    {
	    	System.out.print(a+" is even ");
	    }
	    else
	    {
	    	System.out.print(a+"is odd ");
	    }
	}

}
