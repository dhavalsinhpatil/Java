/*1.Write a java program which accept number from user and return the
count of even digits.
Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4
*/

import java.util.*;

class Digit
{
	public int CoutnEven(int No)
	{
		int iDigit=0,iCnt=0;

		if(No<0)
		{
			No=-No;
		}
		while(No>0)
		{
			iDigit=No%10;
			if(No%2==0)
			{
				iCnt++;
			}
			No=No/10;
		}
		return iCnt;
	}
}

class Ass1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int No=sobj.nextInt();
			
		Digit obj=new Digit();

		int iRet=obj.CoutnEven(No);
		System.out.println("Count is:"+iRet);
	}
}
