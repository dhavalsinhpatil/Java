import java.util.*;
import java.util.Scanner;


// Input : 3
// Output : 3   2   1

// Input : 7
// Output : 7   6   5   4   3   2   1


public class program6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        int iValue=0;

        iValue = sc.nextInt();
        
        for(int i=iValue; i>0 ; i--)
        {
            System.out.print(i+"\t");
        }

    }   
}
