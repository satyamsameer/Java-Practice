import java.util.*;
public class AnalyzeNumbers
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n=input.nextInt();
		double [] a=new double[n];
		double sum=0;
		System.out.print("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextDouble();
			sum=sum+a[i];
		}
		double avg=sum/n;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>avg)
				count++;
		}
		System.out.println("The average is: "+avg);
		System.out.println("The number of items greater than average is: "+count);
	}
}