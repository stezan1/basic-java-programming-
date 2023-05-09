package lab3;

import java.util.Scanner;
import java.util.StringJoiner;

public class d {

	public static void main(String[] args) {
		
		int i,j;
		char []s= {'j','a','v','a'};
		
		//Scanner sc= new Scanner(System.in);
		
		/*
		 * System.out.println("enter string : "); for(i=0;i<4;i++) { s[i]=sc.next(); }
		 * for(i=0;i<4;i++) { System.out.println(s[i]); }
		 */
	 
	    //for(i=0;i<4;i++)
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(s[j]);
			}
		System.out.println();
		}
	}

}
//wap to find add, sub ,mul,div,pow of two numbers using switch case
//wap to check whther the input character is consonant or vowel using switch case
//wap on base of following condition
/*
 * grade = A , if % >90 b , % >80 and %<90 c, % >70 and %<80 d, % >60 and %<70
 * e, %>50 and %<60 f, %<40
 */

