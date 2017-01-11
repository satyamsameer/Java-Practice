import java.util.*;
public class Greater3
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the three numbers:");
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		double n3=input.nextDouble();
		if(n1>n2&&n1>n3)
			System.out.println(n1+" is greater.");
		else if(n2>n3)
			System.out.println(n2+" is greater.");
		else
			System.out.println(n3+" is greater.");
	}
}