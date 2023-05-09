package lab3;

public class exce_hand {

	public static void main(String[] args) {
		//wap to handle the arithmetic exception in java
		//wap to halde the xception i.e ArrayIndexOutOfBounds and null pointer in java
		//wap to hanlde the sql server connection is java swing projct
		
	
		try {
			int a=2/0;
		}

		catch(ArithmeticException e)
		{
			System.out.println("exception occur "+e);
		}
		try {
			int []b= new int [5];
			b[8]=10;
		}

		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("exception occur "+ex);
		}
		try {
			String s= null;
			System.out.println(s.length());
		}

		catch(NullPointerException ex)
		{
			System.out.println("exception occur "+ex);
		}
		finally
		{
			System.out.print("i am finally");
		}
		
	}

}
