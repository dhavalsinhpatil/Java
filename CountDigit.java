import java.util.*;
import java.util.Scanner;

//CountDigit.java

class program14
{
    public static void main(String[] args) {
        int iValue=0,Cnt=0,iDigit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        iValue = sc.nextInt();

        while(iValue!=0)
        {
            iDigit = iValue % 10;
            Cnt++;
            iValue=iValue/10;
        }
        System.out.println("The Count Digit is :"+Cnt);
    }
}
