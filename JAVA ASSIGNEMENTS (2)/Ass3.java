/*3. Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.
Input : “MarvellouS”

Output : 6 (8-2)
*/

import java.util.*;

class StrDemo
{
	public int StrComp(String str)
	{
		int iCnt1=0,iCnt2=0,dif=0;
	
		char Arr[]=str.toCharArray();
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				iCnt1++;
			}
			else 
			{
				iCnt2++;
			}
		}
		dif=iCnt1-iCnt2;
		if(dif<0)
		{
			dif=-dif;
		}
		return dif;
	}
}

class Ass3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		
		StrDemo obj=new StrDemo();

		int iRet=0;
		iRet=obj.StrComp(str);
		
		System.out.println("Diffrence of two case is:"+iRet);
	}
}

		

					
