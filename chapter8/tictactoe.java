/*TicTacToe Game-JAVA -Copyright SAMEER SATYAM*/
import java.util.*;
public class tictactoe
{
	public static void main(String[] args)
	{
		int a[][]={{9,9,9},{9,9,9},{9,9,9}};
		System.out.println("Tic-Tac-Toe # Game: By SAMEER SATYAM ");
		display(a);
		int count=1;
		int ch=0;
		int win=2;
		do
		{
			
				if(count%2==0)
				{
				update0(a);
				display(a);
				win=Iswin(a);
				ch=Isfull(a);
				}
				else
				{
				updateX(a);
				display(a);
				win=Iswin(a);
				ch=Isfull(a);
				}
				count++;
			
		}while(win==2&&ch==0);	
		if(ch==1&&win==2)
					System.out.println("\nGrid is full and Match Draw.");
			else if(win==0)
						System.out.println("\nO Player won. Congratulations..!!");
				else if(win==1)
						System.out.println("\nX Player won. Congratulations..!!");
		
	}
	
	public static int Isfull(int[][] a)
	{
		int c=1;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][j]==9)
						c=0;
				}
			}
		return c;
	}
	public static int Iswin(int[][] a)
	{
		int p=2;
		for(int ch=0;ch<=1;ch++)
		{
			if(a[0][2]==ch&&a[1][1]==ch&&a[2][0]==ch)
				p=ch;
			else if(a[0][0]==ch&&a[1][1]==ch&&a[2][2]==ch)
				p=ch;
			else
			{
				for(int i=0;i<3;i++)
				{
					if((a[i][0]==ch&&a[i][1]==ch&&a[i][2]==ch)||(a[0][i]==ch&&a[1][i]==ch&&a[2][i]==ch))
						p=ch;
				
				}
			}
		}
		return p;
	}
	
	public static void display(int[][] a)
	{
		System.out.print("\n------------------");
		for(int i=0;i<3;i++)
		{
			System.out.print("\n|  ");
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==0)
					System.out.print("0"+"  |  ");
				else if(a[i][j]==1)
					System.out.print("X"+"  |  ");
				else
					System.out.print("  "+"  |  ");
			}
			System.out.print("\n------------------");
		}
	}
	public static void update0(int[][] a)
	{
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.print("\nEnter a row (0,1 or 2) for player 0: ");
			int x=input.nextInt();
			System.out.print("Enter a column (0,1 or 2) for player 0: ");
			int y=input.nextInt();
			if(a[x][y]==9)
			{
				a[x][y]=0;
				return;
			}
		}
	}
	public static void updateX(int[][] a)
	{
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.print("\nEnter a row (0,1 or 2) for player X: ");
			int x=input.nextInt();
			System.out.print("Enter a column (0,1 or 2) for player X: ");
			int y=input.nextInt();
			if(a[x][y]==9)
			{
				a[x][y]=1;
				return;
			}
		}
	}
}