import java.util.*;
public class Lottery
{
	public static void main(String[] args)
	{
		int l=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your lottery pick (Two digits number):");
		int guess=input.nextInt();
		int ld1=l/10;
		int ld2=l%10;
		int gd1=guess/10;
		int gd2=guess%10;
		System.out.println("The lottery number is "+l);
		if(guess==l)
			System.out.println("Exact you win $10,000.");
		else if(gd1==ld2&&gd2==ld1)
			System.out.println("Match all digits you win $3,000");
		else if(gd1==ld1||gd1==ld2||gd2==ld1||gd2==ld2)
			System.out.println("Match one digit you win $1,000");
		else
			System.out.println("Sorry no match..:(");
	}
}