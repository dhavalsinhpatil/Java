/*3. Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/


import java.util.*;
class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		int no=iCol;
		
		for(int i=1;i<=iRow;i++)
		{
					
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(no+"\t");
				
				no--;
						
			}
			no=iCol;
			
			System.out.println();
		}
		
	}
}

class Ass3
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
