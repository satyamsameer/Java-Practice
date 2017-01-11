import java.util.*;
public class Pass2Darray
{
	public static void main(String[] args)
	{
		int[][] m=getArray();
		System.out.println("\nSum of all elements is "+sum(m));
	}
	public static int[][] getArray()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
		int r=input.nextInt();
		System.out.print("Enter the no. of columns: ");
		int c=input.nextInt();
		int[][] m=new int[r][c];
		System.out.println("Enter "+r+" rows and "+c+" columns: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				m[i][j]=input.nextInt();
		}
		return m;
	}
	public static int sum(int m[][])
	{
		int t=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
				t=t+m[i][j];
		}
		return t;
	}
}