import java.util.*;
import java.util.Scanner;

class Main
{
	public static void DigitBreak(int iNo)
	{	
		int iSum=0,iDigit=0;
		while(iNo>0)
			{
				iDigit = iNo%10;
				iSum=iSum+iDigit;
				iNo=iNo/10;
			}
			System.out.print(iSum+" ");
	}

	public static void ArrayWork(int[] Arr)
	{
		for(int i=0; i<Arr.length; i++ ) 
		{
			DigitBreak(Arr[i]);
		}	
	}
	

    public static void main(String[] args) 
    {
		int iValue=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");
		iValue = sc.nextInt();
		int[] array = new int[iValue];
		for(int i=0; i<iValue; i++)
		{
			array[i]=sc.nextInt();
		}

		ArrayWork(array);
    }
}
