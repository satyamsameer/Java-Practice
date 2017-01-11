import java.util.Scanner;//Scanner(specific import) is in the java.util package and for wildcard import use import java.util.*
public class areaC1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius of the circle:");
		double radius=input.nextDouble();
		double area=radius*radius*3.14159;
		System.out.println("Area of circle of radius "+radius+" is "+area);
	}
}