import java.util.*;
//Factors.java

class program23 
{
    public static void Factors(int iNo)
    {
        for(int iCnt=1; iCnt<=(iNo/2); iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(iCnt); 
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int iValue = sc.nextInt();
        Factors(iValue);
    } 
}
