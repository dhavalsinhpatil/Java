/*5.Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.
Input : 2395
Output : -15 (2 - 17)
Input : 1018
Output : 6 (8 - 2)
Input : 8440
Output : 16 (16 - 0)
Input : 5733
Output : -18 (0 - 18)
*/

import java.util.*;

class Digit
{
	public int CountDigit(int iNo)
	{
		int eSum=0,odSum=0,Diff=0,iDigit=0;

		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				eSum=eSum+iDigit;
			}
			else
			{
				odSum=odSum+iDigit;
			}
			iNo=iNo/10;
		}
		return Diff=eSum-odSum;
	}
}

class Ass5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number:");

		int No=sobj.nextInt();

		Digit obj=new Digit();
		int iRet=obj.CountDigit(No);
		System.out.println("op is:"+iRet);
	}
}
	
