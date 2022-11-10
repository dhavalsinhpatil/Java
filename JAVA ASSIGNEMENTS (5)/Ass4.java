/*4. Accept sing from user and reverse the contents of that string
by toggling the case.

Input : “aCBdef”
	
Output : “FEDcbA”
*/

import java.util.*;

class StringDemo
{
	public String StrRevTog(String str)
	{
		
		char Arr[]=str.toCharArray();
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
				Arr[i]-=32;
			}
			else if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				Arr[i]+=32;
		}	}
		char temp;
		int iStart=0;
		int iEnd=Arr.length-1;

		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStart++;
			iEnd--;
		}
		String ss=new String(Arr);
		
		return ss;
	}
}

class Ass4
{
	public static void main(String arg[])
	{
		String iRet;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String str=sobj.nextLine();
		
		StringDemo dobj=new StringDemo();
		iRet=dobj.StrRevTog(str);
		
		System.out.println("Revesed String is:"+iRet);
	}
}
