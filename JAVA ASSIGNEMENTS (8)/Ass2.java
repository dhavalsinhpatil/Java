/*2. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :
H e l l o
H e l l
H e l
H e
H

*/

import java.util.*;
class Pattern
{
	public void Pattern(String str)
	{
		char Arr[]=str.toCharArray();

		int no=Arr.length-1;
		
		for(int i=0;i<Arr.length;i++)
		{
					
			for(int j=0;j<Arr.length;j++)
			{
				if(i+j<=no)
				{
					System.out.print(Arr[j]+"\t");
				}
				
				
						
			}
			
			
			System.out.println();
		}
		
	}
}

class Ass2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the String:");
		String str=sobj.nextLine();

		Pattern obj=new Pattern();

		obj.Pattern(str);
	}
}	
