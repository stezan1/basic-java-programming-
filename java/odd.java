package lab2;

public class odd {

	public static void main(String[] args) {
		//sum of 10 odd numbers
		int a=1,sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+a;
			a=a+2;
		}
		System.out.print("sum = "+sum);
	}

}
