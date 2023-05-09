package lab2;

import java.util.Scanner;

public class vow_cons {

	public static void main(String[] args) {
		String a;
		System.out.print("enter any character :");
		Scanner sc= new Scanner(System.in);
		a =sc.next();
		if(a=="a"||a=="e"||a=="i"||a=="o"||a=="u"||a=="A"||a=="E"||a=="O"||a=="U"||a=="I")
		{
			System.out.print(a+ " is vowel ");
		}

		else
			System.out.print(a+" is consonant");
	}

}
