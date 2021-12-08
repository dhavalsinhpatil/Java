import java.util.*;
import java.util.Scanner;

//Print the DPTUDIOS as per the given Number.

class program4
{
    public static void Display(int iNo)
    {
        for(int i=0; i<iNo; i++)
        {
            System.out.println("DPSTUDIOS");
        }
    }

    public static void main(String[] args) 
    {
        int iValues=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        iValues = sc.nextInt();

        Display(iValues);
    }
}
