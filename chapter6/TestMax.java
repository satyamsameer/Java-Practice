import java.util.*;
public class TestMax
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.print("Enter the two integer numbers: ");
			int a=input.nextInt();
			int b=input.nextInt();
			System.out.println("The maximum of "+a+" and "+b+" is "+max(a,b));
			System.out.print("Do you want to continue (1/0): ");
			ch=input.nextInt();
		}
	}
	public static int max(int a,int b)
	{
		if(a<b)
			return b;
		else
			return a;
	}
}