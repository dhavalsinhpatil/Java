/*3. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :

H
H e
H e l
H e l l
H e l l o
*/


import java.util.*;
class Pattern
{
	public void Pattern(String str)
	{
		char Arr[]=str.toCharArray();
		
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
		
	}
}

class Ass3
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
