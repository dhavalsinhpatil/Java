import java.util.*;
import java.util.Scanner;

// Input : 1
// Output : 1

// Input : 3
// Output : 6

// Input : 5
// Output : 120

class program8
{
    public static int factorial(int iNo)
    {
        int iFact=1;
        for(int i=iNo; i>0; i--)
        { 
            iFact = iFact * i;
        }
        return iFact;
    }

    public static void main(String[] args) {
        int iValue=0,iRet=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        iValue=sc.nextInt();

        iRet = factorial(iValue);
        System.out.println("The Factorial is :"+iRet);

    }
}
