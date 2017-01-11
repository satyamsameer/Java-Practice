import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=input.nextLine();
		int low=0;
		int high=s.length()-1;
		boolean is=true;
		while(low<high)
		{
			if(s.charAt(low)!=s.charAt(high))
			{
				is=false;
				break;
			}
			low++;
			high--;
		}
		if(is)
			System.out.println(s+" is palindrome.");
		else
			System.out.println(s+" is not palindrome.");
	}
}