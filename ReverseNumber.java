import java.util.*;
import java.util.Scanner;

//ReverseNumber.java

class program17
{
    
    public static void Reverse(int iNo)
    {
        int iDigit=0,iRev=0;
        while(iNo>0)
        {
            iDigit=0;
            iDigit = iNo%10;
            iRev = (iRev*10)+iDigit;
            iNo = iNo/10;
        }
        System.out.println(iRev);
    }

    
    public static void main(String[] args) {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to reverse :");
        iValue = sc.nextInt();
        sc.close();
        Reverse(iValue);
    }
}
