/*4. Write a java program which accept string from user and check
whether it contains vowels in it or not.

Input : “marvellous”

Output : TRUE

Input : “Demo”

Output : TRUE

Input : “xyz”

Output : FALSE
*/


import java.util.*;

class StrDemo
{
	public boolean ChkVowel(String str)
	{
		char Arr[]=str.toCharArray();
		char i;
		int icnt=0;
		for(i='\0';i<Arr.length;i++)
		{
			if(Arr[i]=='a'||Arr[i]=='A'||Arr[i]=='e'||Arr[i]=='E'||Arr[i]=='i'||Arr[i]=='I'||Arr[i]=='o'||Arr[i]=='O'||Arr[i]=='U'||Arr[i]=='u')
			{
				icnt++;
			//break;
			}
			i++;
		}
		if(icnt==0)
		{
			
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Ass4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string:");
		
		String str=sobj.nextLine();

		StrDemo dobj=new StrDemo();

		boolean bRet=false;
		bRet=dobj.ChkVowel(str);

		if(bRet==true)
		{

			System.out.println("Therese is ovel is present");
		}
		else
		{
			System.out.println("no ovel is present");
		}
	}
}


