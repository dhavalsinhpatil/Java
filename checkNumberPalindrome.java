import java.util.*;
import java.util.Scanner;

//checkNumberPalindrome.java

class program21
{
    public static int checkPali(int iNo)
    {
        int iTemp=0,iDigit=0,iRev=0;
        iTemp=iNo;
        while(iNo!=0)
        {
            iDigit= iNo%10;
            iRev = (iRev*10)+iDigit;
            iNo= iNo/10;
        }

        if(iTemp==iRev)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
    public static void main(String[] args) {

        int iValues=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number :");
        iValues=sc.nextInt();

        int bRet= checkPali(iValues);
        if(bRet==1)
        {
            System.out.println("The Value is the Palindrome :) ");
        }
        else
        {
            System.out.println("Nahi re Dada te Palindrome :( ");
        }
    }
}
