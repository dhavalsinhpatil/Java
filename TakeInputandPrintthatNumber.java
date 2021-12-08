import java.util.*;
import java.util.Scanner;

// Input : 3
// Output : 1   2   3

// Input : 7
// Output : 1   2   3   4   5   6   7

class program5
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        iValue=sc.nextInt();

        for(int i=1; i<=iValue;i++)
        {
            System.out.print(i+"\t");
        }
    }
}
