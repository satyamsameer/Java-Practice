import java.util.*;
public class HexToDec
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Hexadecimal code: ");
		String hex=input.nextLine();
		System.out.println("The decimal value for hex number "+hex+" is "+hex2dec(hex.toUpperCase()));
	}
	public static  int hex2dec(String hex)
	{
		int d=0;
		for(int i=0;i<hex.length();i++)
		{
			char hexChar=hex.charAt(i);
			d=d*16+hexChar2Dec(hexChar);
		}
		return d;
	}
	public static int hexChar2Dec(char ch)
	{
		if(ch>='A'&&ch<='F')
			return 10+ch-'A';
		else
			return ch-'0';
	}
}