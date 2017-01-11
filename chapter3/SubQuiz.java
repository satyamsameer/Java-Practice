import java.util.*;
public class SubQuiz
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a=(int)(Math.random()*10);
		int b=(int)(Math.random()*10);
		if(b>a)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.print("What is "+a+" - "+b+" ? ");
		int ans=input.nextInt();
		if(a-b==ans)
			System.out.println("You are correct.");
		else
		{
			System.out.println("You are wrong.");
			System.out.println(a+" - "+b+" should be "+(a-b));
		}
	}
}