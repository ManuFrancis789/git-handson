import java.util.Scanner;
class OddEven
{
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  number");
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println("Even number");
			
		}
		
		else
		{
			System.out.println("Odd Number");
		}
		
	}
	
	
}