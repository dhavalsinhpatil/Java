import java.util.*;
import java.util.Scanner;

//DigitBreak.java

class program12
{
    public static void main(String[] args) 
    {
       int iValue=0,iSum=0,iDigit=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Value :");
       iValue = sc.nextInt();
       
       while(iValue>0)
       {
           iDigit = iValue%10;
           iValue=iValue/10;
           System.out.print(iDigit);
       }
    }
}
