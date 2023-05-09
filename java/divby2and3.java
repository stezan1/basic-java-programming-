package lab1;

import java.util.Scanner;

public class divby2and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter any number : ");
	    Scanner scan= new Scanner(System.in);
	    a=scan.nextInt();
	    if(a%2==0 && a%3==0)
	    {
	    	System.out.print(a+" is divisible by 2 and 3");
	    }
	    else if(a%2==0 && a%3!=0)
	    {
	    	System.out.print(a+" is divisible by 2 only ");
	    }
	    else if(a%2!=0 && a%3==0)
	    {
	    	System.out.print(a+" is divisible by 3 only ");
	    }
	    else 
	    {
	    	System.out.print(a+" is not divisible by 2 or 3  ");
	    }
	}

}
