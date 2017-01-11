public class TestRandomCharacter
{
	public static void main(String[] args)
	{
		final int n=175;
		final int no=25;
		for(int i=0;i<n;i++)
		{
			char ch=RandomCharacter.getRandomLowerCaseLetter();
			if((i+1)%no==0)
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}