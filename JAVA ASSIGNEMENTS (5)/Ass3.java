/*3. Write a program which 2 strings from user and check whether
first N contents of two strings are equal or not.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.

Input : “Marvellous Infosystems”
“Marvellous Logic Building”
10

Output : TRUE
*/
import java.util.*;
class StringDemo
{
	public boolean StrNCmpX(String src,String dest,int iNo)
	{
		
		int iCnt=0;
		int i=0;
		char Arr[]=src.toCharArray();
		char Brr[]=dest.toCharArray();
		for(i=0;((i<Arr.length)&&(i<Brr.length));i++)
		{
			if(Arr[iNo]==Brr[iNo])
			{
				iCnt++;
				break;
			}
		}
		if(iCnt==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}


class Ass3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the firat string:");

		String str1=sobj.nextLine();
				System.out.println("Enter the Scond string:");

		String str2=sobj.nextLine();
		System.out.println("Enter the number:");
		int no=sobj.nextInt();

		StringDemo obj=new StringDemo();
		
		 boolean bRet=false;
		bRet=obj.StrNCmpX(str1,str2,no);

		if(bRet==true)
		{
			System.out.println("both string are same");
		}
		else 
		{
			System.out.println("not same");
		}
	}
}
