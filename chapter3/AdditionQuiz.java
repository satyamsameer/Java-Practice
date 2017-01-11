import java.util.*;
public class AdditionQuiz
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		System.out.print("What is "+n1+" + "+n2+" ? ");
		double add=input.nextDouble();
		System.out.println(n1+" + "+n2+" = "+(n1+n2)+" So your answer is "+(n1+n2==add));
	}
}