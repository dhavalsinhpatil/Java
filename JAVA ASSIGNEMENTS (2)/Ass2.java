/*2. Write a java program which accept string from user and count
number of small characters.


Input : “Marvellous”

Output : 9
*/

import java.util.*;

class StringDemo
{

	public int CntSmall(String str)
	{
		int iCnt=0;
		
		char Arr[]=str.toCharArray();

		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}


class Ass2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String obj=sobj.nextLine();

		int iRet=0;

		StringDemo dobj=new StringDemo();

		iRet=dobj.CntSmall(obj);

		System.out.println("Small latters count is:"+iRet);
	}
}		
