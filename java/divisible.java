package lab1;

import java.util.Scanner;

public class divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		System.out.println("enter any number : ");
	    Scanner scan= new Scanner(System.in);
	    a=scan.nextInt();
	    if(a%3==0 && a%5==0)
	    {
	    	System.out.print(a+" is divisible by 5 and 3");
	    }
	    else if(a%3==0 && a%5!=0)
	    {
	    	System.out.print(a+" is divisible by 3 only ");
	    }
	    else if(a%3!=0 && a%5==0)
	    {
	    	System.out.print(a+" is divisible by 5 only ");
	    }
	    else 
	    {
	    	System.out.print(a+" is not divisible by 5 or 3  ");
	    }
	}

}
