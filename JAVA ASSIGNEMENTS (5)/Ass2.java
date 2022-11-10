/*2. Write a program which 2 strings from user and check whether
contents of two strings are equal or not.

Input : “Marvellous Infosystems”
“Marvellous Infosystems”

Output : TRUE
*/

import java.util.*;

class StringDemo
{
	public boolean StrComx(String src,String dest)
	{
		int iCnt=0;
		int i=0;
		char Arr[]=src.toCharArray();
		char Brr[]=dest.toCharArray();

		for(i=0;((i<Arr.length)&&(i<Brr.length));i++)
		{
			if(Arr[i]==Brr[i])
			{
				iCnt++;
				
				
			}
			
		}
		if((Arr.length==iCnt))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Ass2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the firat string:");

		String str1=sobj.nextLine();
				System.out.println("Enter the Scond string:");

		String str2=sobj.nextLine();
		StringDemo obj=new StringDemo();
		
		 boolean bRet=false;
		bRet=obj.StrComx(str1,str2);

		if(bRet==true)
		{
			System.out.println("both string are same");
		}
		else 
		{
			System.out.println("not same");
		}
	}
}
