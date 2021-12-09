import java.util.*;
import java.util.Scanner;

//DigitBreakAddition.java
class program13
{
    public static void main(String[] args) 
    {
        int iValue=0, iDigit=0,iSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        iValue = sc.nextInt();

        while(iValue!=0)
        {
            iDigit = iValue % 10;
            System.out.print(iDigit+"\t");
            iValue=iValue/10;
            iSum=iSum+iDigit;
        }
        System.out.println("");
        System.out.println("The Addition of Factors :"+iSum);
    }
}
