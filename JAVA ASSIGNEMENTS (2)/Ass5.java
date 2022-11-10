/*5. Write a java program which accept string from user and display
it in reverse order.

Input : “MarvellouS”

Output : “SuollevraM”
*/

import java.util.*;

class StringDemo
{
	public String StrRev(String str)
	{
		char Arr[]=str.toCharArray();
	
		int iStart=0;
		int iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStart++;
			iEnd--;
			
		}
		String sr=new String(Arr);
		return sr;
	
			
	}
}

class Ass5
{
	public static void main(String arg[])
	{
		String iRet;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String str=sobj.nextLine();
		
		StringDemo dobj=new StringDemo();
		iRet=dobj.StrRev(str);
		
		System.out.println("Revesed String is:"+iRet);
	}
}
