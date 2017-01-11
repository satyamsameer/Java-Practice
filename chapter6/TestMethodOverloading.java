import java.util.*;
public class TestMethodOverloading
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("The maximum of 1 and 3 is "+max(1,3));
		System.out.println("The maximum of 3.2 and 1.2 is "+max(3.2,1.2));
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is "+max(3.0,5.4,10.14));
	}
	public static int max(int n1,int n2)
	{
		if(n1>n2)
			return n1;
		else
			return n2;
	}
	public static double max(double n1,double n2)
	{
		if(n1>n2)
			return n1;
		else
			return n2;
	}
	public static double max(double n1,double n2,double n3)
	{
		return max(max(n1,n2),n3);
	}
}