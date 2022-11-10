/*2. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 3
Output :
1 2 3
1 2 3
1 2 3
1 2 3
*/


import java.util.*;
class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		int no=1;
		
		for(int i=1;i<=iRow;i++)
		{
					
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(no+"\t");
				
				no++;
						
			}
			no=1;
			
			System.out.println();
		}
		
	}
}

class Ass2
{
	public static void main(String arg[])
	{
		Scanner src=new Scanner(System.in);

		System.out.println("Enter the row size");
		int No1=src.nextInt();
		System.out.println("Enter the columan size");

		int No2=src.nextInt();

		Pattern obj=new Pattern();

		obj.Pattern(No1,No2);
	}
}	
