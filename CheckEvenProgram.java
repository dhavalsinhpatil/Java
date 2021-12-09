import java.util.*;
import java.util.Scanner;

//CheckEvenProgram.java

class program9
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value to Check Even or Not :");
        iValue=sc.nextInt();

        if((iValue%2)==0)
        {
            System.out.println("The Number is Even.");
        }
        else
        {
            System.out.println("The Number is NOT Even.");
        }
    }
}
