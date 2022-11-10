/*5. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :
H
H e
H e l
H e l l
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
		//int no=Arr.length-1;
		
		
		for(int i=0;i<Arr.length;i++)
		{
					
			for(int j=0;j<Arr.length;j++)
			{
				if((i==j)||(i>j))
				{
					System.out.print(Arr[j]+"\t");
				}
				
				
						
			}
			
			System.out.println();
		}

		for(int i=Arr.length;i>=0;i--)
		{
					
			for(int j=0;j<i;j++)
			{
				if(i+j<=Arr.length-1)
				{
					System.out.print(Arr[j]+"\t");
				}
				
				
						
			}
			
			
			System.out.println();
		}
		
	}
}

class Ass5
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
