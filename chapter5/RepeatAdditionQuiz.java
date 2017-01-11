import java.util.*;
public class RepeatAdditionQuiz
{
	public static void main(String[] args)
	{
		int n1=(int)(Math.random()*10);
		int n2=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+n1+"+"+n2+" ? ");
		int ans=input.nextInt();
		while(n1+n2!=ans)
		{
				System.out.print("Wrong answer. Try again. What is "+n1+"+"+n2+" ? ");
				ans=input.nextInt();
		}
		System.out.println("You got it..!");
	}
}