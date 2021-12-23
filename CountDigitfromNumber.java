import java.util.*;

//CountDigit.java

class program22 
{
    public static int CountDigit(int iNo)
    {
        int iCnt=0;
        while(iNo!=0)
        {
            iNo= iNo/10; 
            iCnt++;
        }
        
        return iCnt;

    }

    public static void main(String[] args) {
        
        int iValue=0,iRet=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value :");
        iValue = sc.nextInt();

        iRet=CountDigit(iValue);
        System.out.println("The Total Count of the Digit is : "+iRet);

    }
}
