import java.io.*;
import java.net.*;
import java.rmi.*;
public class clientR{
	public static void main(String args[]) throws Exception{
		java.util.Scanner input=new java.util.Scanner(System.in);
		InetAddress ia=InetAddress.getLocalHost();
		String s[]=ia.toString().split("/");
		String url="rmi://"+s[1]+"/server";
		System.out.println("RMI - Example");
		multiply m=(multiply)Naming.lookup(url);
		System.out.print("Enter first number :");
		int a=input.nextInt();
		System.out.print("Enter second number :");
		int b=input.nextInt();
		System.out.println("Multiply a and b is "+m.multiply(a,b));
	}
}