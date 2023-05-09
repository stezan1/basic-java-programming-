package lab1;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.print(" enter a , b and c :");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
        if(a>b && a>c )
        {
        	System.out.print(a+ " is greater ");
        }
        else if(b>a && b>c )
        {
        	System.out.print(b+ " is greater ");
        }
        else if(c>a && c>b )
        {
        	System.out.print(c+ " is greater ");
        }
	}

}
