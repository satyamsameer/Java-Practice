import java.util.*;
public class WhatItIs
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any character:");
		String read=input.next();
		char ch=read.charAt(0);
		if(ch>='A'&&ch<='Z')
			System.out.println(ch+" is an uppercase letter.");
		else if(ch>='a'&&ch<='z')
			System.out.println(ch+" is a lowercase letter.");
		else if(ch>='0'&&ch<='9')
			System.out.println(ch+" is a digit.");
	}
}