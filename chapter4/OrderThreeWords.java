import java.util.*;
public class OrderThreeWords
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the first word:");
	String w1=input.nextLine();
	System.out.print("Enter the second word:");
	String w2=input.nextLine();
	System.out.print("Enter the third word:");
	String w3=input.nextLine();
	if(w1.compareTo(w2)<0&&w1.compareTo(w3)<0)
	{
		if(w2.compareTo(w3)<0)
			System.out.println("Sequence is: "+w1+" "+w2+" "+w3);
		else
			System.out.println("Sequence is: "+w1+" "+w3+" "+w2);
	}
	else if(w2.compareTo(w1)<0&&w2.compareTo(w3)<0)
	{
		if(w1.compareTo(w3)<0)
			System.out.println("Sequence is: "+w2+" "+w1+" "+w3);
		else
			System.out.println("Sequence is: "+w2+" "+w3+" "+w1);
	}
	else
	{
		if(w1.compareTo(w2)<0)
			System.out.println("Sequence is: "+w3+" "+w1+" "+w2);
		else
			System.out.println("Sequence is: "+w3+" "+w2+" "+w1);
	}
	}
}