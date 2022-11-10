/*4. Write Java program which accept N numbers from user and display
all such elements which are divisible by 3 and 5.
Input : N : 6
Elements : 85 66 3 15 93 88
Output : 15
*/

import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]%3==0)&&(Arr[i]%5==0))
			{
				System.out.println("o/p is:"+Arr[i]);
			}
		}
	}
}

class Ass4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the size of elements:");

		int size=sobj.nextInt();

		System.out.println("Enter the elements:");

		int Arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		ArrayDemo obj=new ArrayDemo();
		obj.Display(Arr);
	}
}
