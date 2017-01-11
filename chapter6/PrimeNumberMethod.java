public class PrimeNumberMethod
{
	public static void main(String[] args)
	{
		System.out.println("The first 10 prime numbers are \n");
		printPrimeNumbers(50);
	}
	public static void printPrimeNumbers(int numberOP)
	{
		final int NumberPrimesPerLine=10;		
		int count=0;
		int number=2;
		while(count<numberOP)
		{
			if(isPrime(number))
			{
				count++;
				if(count%NumberPrimesPerLine==0)
					System.out.printf("%-5s\n",number);
				else
					System.out.printf("%-5s",number);
			}
			number++;
		}
	}
	public static boolean isPrime(int number)
	{
		for(int d=2;d<=number/2;d++)
		{
			if(number%d==0)
				return false;
		}
		return true;
	}
}