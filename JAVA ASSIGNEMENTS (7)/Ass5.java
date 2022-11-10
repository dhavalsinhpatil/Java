/*5. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4

Output : 
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

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
				
				
						
			}
			no++;
			
			System.out.println();
		}
		
	}
}

class Ass5
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
