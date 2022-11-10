/*1. Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 53 (234 - 181)
*/

import java.util.*;

class ArrayDemo
{
	public int Diffr(int Arr[])
	{
		int i=0,eSum=0,odSum=0,Diff=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				eSum=eSum+Arr[i];
			}
			else
			{
				odSum=odSum+Arr[i];
			}
		}

		return Diff=eSum-odSum;
	}
}

class Ass1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the numbers:");
		
		int size=sobj.nextInt();
		int Arr[]=new int[size];
	
		System.out.println("Enter the elements:");

		for(int i=0;i<size;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		ArrayDemo obj=new ArrayDemo();
		int iRet=obj.Diffr(Arr);
		System.out.println("Diference is:"+iRet);
	}
}
