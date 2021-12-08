import java.net.InetAddress;
import java.util.*;
import java.util.Scanner;

// Input : 3
// Output : 6

// Input : 5
// Output : 15

class program7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iValue=0,iCnt=0,iSum=0;
        System.out.println("Enter the Value :");
        iValue=sc.nextInt();
        
        for(iCnt=1;iCnt<=iValue;iCnt++)
        {
           iSum = iSum+iCnt; 
           
        } 
        System.out.println(iSum);   
    }
}
