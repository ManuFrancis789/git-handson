
class Discount
{
	
	static double x,y,amo;
	 public static double amount(double a,double b)
	 {
		 x=a;
		 y=b;
		 amo=a+b;
		 
		 return amo;
		 
	 }
	 
	 
	 
	public static double discountAmount()
	{
	double d;
		if(amo>=5000)
		{
			System.out.println("Eligible for discount");
			d = amo*20/100;
		}
			else
		{
			System.out.println("Not Eligible for discount");
			d=0;
		}
		return d;
	}
	public static void main(String args[])
	{
	double total = Discount.amount(3500,1500);
	double disc = Discount.discountAmount();
		total = total-disc;
		System.out.println("Final Amount = "+total);
		
		
	}
	
	
	
	
}