import java.util.*;
import java.util.Scanner;

class program1{

    public static int Addition(int iNo, int iNo2)
    {
        int iResult=0;
        iResult = iNo+iNo2;
        return iResult;
    }

    public static void main(String[] args)
    {
        //Addition of Two Programs

        int iValue1=0, iValue2=0, iRet=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1 :");   
        iValue1 = sc.nextInt();

        System.out.println("Enter the Number 2 :");   
        iValue2 = sc.nextInt();

        iRet = Addition(iValue1,iValue2);
        System.out.println(iRet);
        
    }
}
