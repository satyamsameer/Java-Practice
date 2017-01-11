import java.util.*;
public class gcd2
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
		System.out.print("Enter the first integer: ");
		int n1=input.nextInt();
		System.out.print("Enter the second integer: ");
		int n2=input.nextInt();
		System.out.println("The greatest common factor is "+n1+" and "+n2+" is "+gcd(n1,n2));
		System.out.print("Do you want to continue: ");
		ch=input.nextInt();
		}
	}
	public static int gcd(int n1,int n2)
	{
		int gcd=1;
		int k=2;
		while(k<=n1&&k<=n2)
		{
			if(n1%k==0&&n2%k==0)
				gcd=k;
			k++;
		}
		return gcd;
	}
}