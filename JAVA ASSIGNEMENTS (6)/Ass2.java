/*2. Write Java program which accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
A B C D
a b c d
A B C D
a b c d
*/

import java.util.*;
class Pattern
{
	public void Pattern(int iRow,int iCol)
	{
		char ch1='A';
		char ch2='a';
		for(int i=1;i<=iRow;i++)
		{
			
				if(i%2==0)
				{
					for(int j=1;j<=iCol;j++)
					{
						System.out.print(ch2+"\t");
						ch2++;	
					}
					
				}
				else
				{
					for(int j=1;j<=iCol;j++)
					{
						System.out.print(ch1+"\t");
						ch1++;
						
					}
				}
			ch1='A';
			ch2='a';
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
