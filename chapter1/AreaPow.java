import java.util.*;
public class AreaPow
{
	public static void main(String[] args)
	{
		final double PI=3.14159;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius of the circle:");
		double radius=input.nextDouble();
		double area=PI*Math.pow(radius,2);
		System.out.println("Area of circle of radius "+radius+" is "+area);
	}
}