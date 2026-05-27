import java.util.*;
public class Bitwiser 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units consumed by the customer");
		int units = sc.nextInt();
		int amount = 0;
		if(units <= 250)
		{
			amount =0;
		}
		else if(units >= 250 && units <=300)
		{
			amount=amount+50;
		}
		else if(units > 300 && units <= 350 )
		{
			amount=amount+100;
		}
		else if(units > 350 && units <= 400)
		{
			amount=amount+150;
		}
		System.out.println(amount);
		sc.close();
	}
}