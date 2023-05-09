package lab1;

import java.util.Scanner;

public class pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("enter any number : ");
	    Scanner scan= new Scanner(System.in);
	    a=scan.nextInt();
	    if(a<0)
	    {
	    	System.out.print(a+" is negative ");
	    	
	    }
	    else
	    {
	    	System.out.print(a+" is positive ");
	    }
	}

}
