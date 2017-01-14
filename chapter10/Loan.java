import java.util.*;
public class Loan
{
	private double annualir;
	private int noofyears;
	private double loanamt;
	private java.util.Date loanDate;
	
	public Loan(){//Constructor
		this(2.5,1,1000);
	}
	public Loan(double annualir,int noofyears,double loanamt){
		this.annualir=annualir;
		this.noofyears=noofyears;
		this.loanamt=loanamt;
		loanDate=new java.util.Date();
	}
	public double getAnuualir(){
		return annualir;
	}
	public void setannualir(double annualir){
		this.annualir=annualir;
	}
	public int getnoofyears(){
		return noofyears;
	}
	public void setnoofyears(int noofyears){
		this.noofyears=noofyears;
	}
	public double getmonthlypay(){
		double mir=annualir/1200;
		double mpay=loanamt*mir/(1-(1/Math.pow(1+mir,noofyears*12)));
		return mpay;
		
	}
	public double gettotalpay(){
		double tpay=getmonthlypay()*noofyears*12;
		return tpay;
	}
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}