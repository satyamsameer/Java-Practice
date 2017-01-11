import java.util.*;
public class GuessBirthday
{
	public static void main(String[] args)
	{
		String s1=
			" 1 3 5 7\n"+" 9 11 13 15\n"+" 17 19 21 23\n"+" 25 27 29 31";
		String s2=
			" 2 3 6 7\n"+" 10 11 14 15\n"+" 18 19 22 23\n"+" 26 27 30 31";
		String s3=
			" 4 5 6 7\n"+" 12 13 14 15\n"+" 20 21 22 23\n"+" 28 29 30 31";
		String s4=
			" 8 9 10 11\n"+" 12 13 14 15\n"+" 24 25 26 27\n"+" 28 29 30 31";
		String s5=
			" 16 17 18 19\n"+" 20 21 22 23\n"+" 24 25 26 27\n"+" 28 29 30 31";
		int day=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Is your birthday in Set 1?\n");
		System.out.print(s1);
		System.out.print("\nEnter 0 for NO and 1 for YES: ");
		int answer=input.nextInt();
		if(answer==1)
			day+=1;
		
		System.out.print("Is your birthday in Set 2?\n");
		System.out.print(s2);
		System.out.print("\nEnter 0 for NO and 1 for YES: ");
		answer=input.nextInt();
		if(answer==1)
			day+=2;
			
		System.out.print("Is your birthday in Set 3?\n");
		System.out.print(s3);
		System.out.print("\nEnter 0 for NO and 1 for YES: ");
		answer=input.nextInt();
		if(answer==1)
			day+=4;
			
		System.out.print("Is your birthday in Set 4?\n");
		System.out.print(s4);
		System.out.print("\nEnter 0 for NO and 1 for YES: ");
		answer=input.nextInt();
		if(answer==1)
			day+=8;
			
		System.out.print("Is your birthday in Set 5?\n");
		System.out.print(s5);
		System.out.print("\nEnter 0 for NO and 1 for YES: ");
		answer=input.nextInt();
		if(answer==1)
			day+=16;
			
		System.out.println("\nYour birthday is "+day+" !");
	}
}