import java.util.*;
public class FnameLname
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your full name:");
		String s=input.nextLine();
		int k=s.indexOf(' ');
		String fn=s.substring(0,k);
		String ln=s.substring(k+1);
		System.out.println("Your First Name is: "+fn+"\nLast Name is: "+ln);
	}
}