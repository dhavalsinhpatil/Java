/*1. Write a java program which accepts 2 strings from user and concat N characters of second string after first string.Value of N should be accepted from user.
Note : If third parameter is greater than the size of second string then concat whole string after first string.

Input : “Marvellous Infosystems”
“Logic Building”
5

Output : “Marvellous Infosystems Logic”
*/

import java.util.*;
class StringDemo
{
	public String StrNCat(String src,String dest,int iCnt)
	{
		int i=0,j=0;
		
		//while(iCnt>=0)
		char Arr[]=new char[iCnt];
		
		for(i=0;i<iCnt;i++)
		{
			Arr[i]=dest.charAt(i);
		}
		String sr=new String(Arr);
		return src+sr;
		
		
		
	}
	
}


class Ass1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter First String:");
		String str=sobj.nextLine();
		System.out.println("Enter the Second String:");
		String str2=sobj.nextLine(); 
		
		System.out.println("Enter the Number:");
		int No=sobj.nextInt();

		StringDemo obj=new StringDemo();

		String iRet=obj.StrNCat(str,str2,No);
		System.out.println("Product is:"+iRet);
	}
}

