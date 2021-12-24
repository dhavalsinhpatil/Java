import java.util.*;
//SumofFactors.java

class program24
{
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
        int iRet= Factors(iValue);
        System.out.println("The Addition is :"+iRet);
    } 
}
