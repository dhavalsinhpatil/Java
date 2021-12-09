import java.util.*;
import java.util.Scanner;

//CountDigitEven.java

class program15
{
    public static int CountDigitEven(int iNo)
    {
        int iDigit=0,iCnt=0;
        while(iNo>0)
        {
            iDigit = iNo%10;
            if((iDigit%2)==0)
            {
                iCnt++;
            }
            iNo= iNo/10;
        }
        return iCnt;
    }
    public static void main(String[] args) {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        iValue = sc.nextInt();

        int iRet=CountDigitEven(iValue);
        System.out.println("The Count is for Even Digit is :"+iRet);
    }
}
