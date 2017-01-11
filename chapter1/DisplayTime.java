import java.util.*;
public class DisplayTime
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integer for seconds:");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int rseconds=seconds%60;
		System.out.println(seconds+" seconds is equal to "+minutes+" minutes and "+rseconds+" seconds");
	}
}