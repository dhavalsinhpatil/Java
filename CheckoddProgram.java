import java.util.*;
import java.util.Scanner;

//CheckODDProgram.java

class program10
{
    public static void main(String[] args) 
    {
        int iValue=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value to Check odd or Not :");
        iValue=sc.nextInt();

        if((iValue%2)!=0)
        {
            System.out.println("The Number is odd.");
        }
        else
        {
            System.out.println("The Number is NOT odd.");
        }
    }
}
