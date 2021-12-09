import java.util.*;
import java.util.Scanner;

//FactorsJava
class program11
{
    public static void FactorsX(int iNo)
    {
        for(int iCnt = 1; iCnt < iNo; iCnt++)        // O(N)
        {
          if((iNo%iCnt) == 0)    // ICnt is a factor
          {
                System.out.print(iCnt+"\t");
          }
        }
    }

    public static void main(String[] args) {
        
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value to get Factors :");
        iValue = sc.nextInt();

        FactorsX(iValue);
    }
}
