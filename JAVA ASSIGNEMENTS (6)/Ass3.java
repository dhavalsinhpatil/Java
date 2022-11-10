/*3. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 3 iCol = 5
Output :
A A A A A
B B B B B
C C C C C
*/

import java.util.*;
class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		char ch1='A';
		
		for(int i=1;i<=iRow;i++)
		{
					
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(ch1+"\t");
				
						
			}
			ch1++;
			//ch1='A';
			
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
