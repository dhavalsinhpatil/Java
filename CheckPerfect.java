import java.util.*;
//CheckPerfect.java

class program25
{
    public static void CheckPerfect(int iNumber)
    {
        int iTemp=iNumber;
        int iRet=Factors(iNumber);
        if(iTemp==iRet)
        {
            System.out.println("The Number is :) the Perfect Number.");
        }
        else
        {
            System.out.println("The Number NOT :( Perfect Number.");
        }
    }
    public static int Factors(int iNo)
    {
        int iSum=0;
        for(int iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                iSum=iSum+iCnt;
            }
        }
        return iSum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int iValue = sc.nextInt();
        CheckPerfect(iValue);
    } 
}
