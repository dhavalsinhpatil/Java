/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class res
{
    public static int Check(int iCheck,int[] Brr)
    {
        int i=0,iSum=0;
        for(i=0; i<Brr.length;i++)
        {
            if(iCheck!=Brr[i])
            {   
                iSum=iSum+Brr[i];
                
            }
        }
        return iSum;
    }
    public static int Handshake(int[] Arr)
    {
        int iSize=0,i=0,iResult=0;
        iSize= Arr.length;

        for(i=0;i<iSize;i++)
        {
            int iGet=Arr[i];
            iResult=iResult+(Arr[i]*(Check(iGet,Arr)));
            System.out.println("The iResult is :"+iResult);
        }

        return iResult; 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        int N=0,iRet=0;
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        int Arr[]= new int[N];

        int i=0;
        for(i=0;i<N;i++)
        {
            Arr[i]=sc.nextInt();
        }

        iRet=Handshake(Arr);
        System.out.print(iRet);
	}
}
