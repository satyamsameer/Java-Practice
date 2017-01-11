public class GradeMethod
{
	public static void main(String[] args)
	{
		System.out.print("The grade is "+getGrade(78));
		System.out.print("\nThe grade is "+getGrade(51));
	}
	public static char getGrade(double n)
	{
		if(n>=90.0)
			return 'A';
		else if(n>=80.0)
			return 'B';
		else if(n>=70.0)
			return 'C';
		else if(n>=60.0)
			return 'D';
		else
			return 'F';
	}
}