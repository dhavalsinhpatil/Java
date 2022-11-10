/*5. Accept string from user and check whether the string is palindrome or not without considering its case.

Input : “1abccBA1”
Output : TRUE
*/

import java.util.*;

class StringDemo
{
	public boolean StringPal(String Str)
	{
		
		char temp[]=Str.toCharArray();
		int iCnt=temp.length;
		
		char temp2[]=Str.toCharArray();
		for(int i=temp.length-1;i>0;i--)
		{
			if(((temp[i]>='a')&&(temp[i]<='z'))&&((temp2[i]>='A')&&(temp2[i]<='Z')))
		{
			temp[i]-=32;
		}
		else if(((temp[i]>='A')&&(temp[i]<='Z'))&&((temp2[i]>='a')&&(temp2[i]<='z')))
		{
			temp[i]+=32;
		}
			if(temp[i]!=temp2[i])
			{
				break;
			}
			else
			{
				iCnt--;
			}
		}
		if(iCnt==0)
		{
			return true;
		}
		else
		{
			return false;
		}
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
			boolean bRet=false;
			bRet=dobj.StringPal(str);
			if(bRet==true)
			{
				
				System.out.println("String is palendrom");
			}
			else
			{
				System.out.println("String is not palendrom");
			}
		}
}

