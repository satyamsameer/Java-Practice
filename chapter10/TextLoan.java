import java.util.*;
import java.util.Scanner;
class TextLoan{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the annual interest rate :");
		double annualirate=input.nextDouble();
		System.out.println("Enter the number of years in integer :");
		int years=input.nextInt();
		System.out.println("Enter the loan amount :");
		double lamt=input.nextDouble();
		Loan l=new Loan(annualirate,years,lamt);
		System.out.printf("The loan was created on %s\n"+"The monthly payment is %.2f\nThe total payment is %.2f\n",l.getLoanDate().toString(),l.getmonthlypay(),l.gettotalpay());
	}
}