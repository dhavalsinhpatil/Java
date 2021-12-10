import java.util.*;
import java.util.Scanner;

//CheckPallindrome.java

class program18
{
    public static int checkNumberPalindrame(int iNo)
    {
        int iDigit=0,iRev=0;
        int iTemp=iNo;
        while(iNo!=0)
        {
            iDigit = iNo %10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev==iTemp)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        int iValue;
        int bRet=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        iValue = sc.nextInt();

        bRet = checkNumberPalindrame(iValue);
        if(bRet==0)
        {
            System.out.println("Number is Palindrome.");
        }
        else
        {
            System.out.println("Number is NOT Palindrome.");
        }
    }
}
