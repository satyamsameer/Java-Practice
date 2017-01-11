import java.util.*;
public class OddEven
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		double n=input.nextDouble();
		if(n%2==0)
			System.out.println(n+" is Even.");
		else
			System.out.println(n+" is Odd.");
	}
}
