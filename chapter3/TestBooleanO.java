import java.util.*;
public class TestBooleanO
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=input.nextInt();
		if(n%2==0&&n%3==0)
			System.out.println(n+" is divisible by 2 and 3.");
		if(n%2==0||n%3==0)
			System.out.println(n+" is divisible by 2 or 3.");
		if(n%2==0^n%3==0)
			System.out.println(n+" is divisible by 2 or 3 but not both.");
	}
}