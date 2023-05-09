package lab3;

public class rectangle {
	
	public void volume(int l,int b,int h)
	{
		System.out.print("volume = "+(l*b*h));
	}
	
	
	

	public static void main(String[] args) {
		rectangle rect = new rectangle();
		rect.volume(5,2,3);

	}

}
