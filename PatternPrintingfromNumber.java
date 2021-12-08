import java.util.*;
import java.util.Scanner;

//Accept number from user and display that number of * on screen.

class program2
{

    public static void Pattern(int iNo)
    {
        for(int i=0; i<iNo; i++)
        {
            System.out.print("*");
        }
    }

    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        iValue = sc.nextInt();

        Pattern(iValue);
    }
}
