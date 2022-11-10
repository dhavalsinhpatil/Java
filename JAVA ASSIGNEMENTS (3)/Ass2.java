/*2. Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 85 80
*/

import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		int i=0;
	
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]%5==0)
			{
				System.out.println("Divisiable by 5 nos are"+Arr[i]);
			}
		}
	
	}
}

class Ass2
{
	public static void main(String Arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the size of nos:");

		int size=sobj.nextInt();


		System.out.println("Enter the number of elements:");

		int Arr[]=new int[size];

		for(int i=0;i<size;i++)
		{
			Arr[i]=sobj.nextInt();
		}

		
		ArrayDemo obj=new ArrayDemo();
		obj.Display(Arr);
	}
}
