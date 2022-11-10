/*3.Write a program which accept number from user and return the count of digits in between 3 and 7.
Input : 2395
Output : 1
Input : 1018
Output : 0
Input : 4521
Output : 2
Input : 9922
Output : 0
*/

import java.util.*;

class Digit
{
	public int CountRange(int iNo)
	{

		int iCnt=0;
		if(iNo<0)
		{
			iNo=-iNo;
		}
	
		while(iNo>0)		
		{
			int iDigit=iNo%10;
			if((iDigit>3)&&(iDigit<7))
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}

class Ass3
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number:");

		int No=sobj.nextInt();
		Digit obj=new Digit();

		int iRet=obj.CountRange(No);

		System.out.println("o/p is:"+iRet);
	}
}
