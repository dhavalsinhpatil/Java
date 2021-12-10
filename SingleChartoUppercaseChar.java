// Accept one character from user and convert case of that character. 
//Input : a Output : A 
//Input : D Output : d 

import java.util.*;
import java.util.Scanner;

class Program16
{
    public static void Display(char cNo)
    {
        if(cNo >= 'a' && cNo<= 'z')
        {
            System.out.print(Character.toUpperCase(cNo));
        }
        else
        {
            System.out.println("");
            System.out.println("Yeda zala ka be :) ");
            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        char cValue;
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter Character: ");
        cValue =sobj.next().charAt(0);

        Display(cValue);

    }
}
