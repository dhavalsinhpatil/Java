/*1.Write a Java program which accept string from user and count number of capital characters.
Input : “Marvellous Multi OS”

Output : 4
*/

import java.util.*;

class StringDemo
{
	public int CountCapital(String str)
	{
		int iCnt=0;
		char Arr[]=str.toCharArray();
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}


class Ass1
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string");
		
		String str=sobj.nextLine();

		int iRet=0;
		
		StringDemo obj=new StringDemo();

		iRet=obj.CountCapital(str);

		System.out.println("Count of the capital Latters is:"+iRet);
	}
}
