package powerbill;
import java.util.Scanner;

public class Generated {
	
    public static Scanner S;
	public static double bill;
	
	public static void main(String args[])
	{
		System.out.println("enter the no of  user units");
		S = new Scanner(System.in);
	double unit = S.nextDouble();
	
		if(unit <100)
		{
			bill  = (double)(unit*2.50);
			System.out.println((bill));
		}
		
		if(unit >=100 & unit<500) 
		{
			bill  = (unit-100)*3;
			System.out.println((100*2.5)+(bill));
		}
		
		if(unit >= 500) 
		{
			bill  = (unit-500)*4.5;
			System.out.println(((100*2.5)+(400*3.0)+bill));
			
		}
	
	 }
}
