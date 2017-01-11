import java.util.*;
public class calculator
{	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the expression: ");
		String s=input.nextLine();
		cal(s);
	}
	public static void cal(String args)
	{
		if(args.length!=1)
		{
			System.out.println("Usage: Java Calculator Operand1 operator Operand2");
			System.exit(0);
		}
		int result=0;
		switch(args[1].charAt(0))
		{
			case '+': result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);break;
			case '-': result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);break;
			case '*': result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);break;
			case '/': result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);break;
			case '%': result=Integer.parseInt(args[0])%Integer.parseInt(args[2]);break;
		}
		System.out.println(args[0]+' '+args[1]+' '+args[2]+"="+result);
	}
}