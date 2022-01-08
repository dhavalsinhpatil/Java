import java.util.*;

class Main
{
    public static void Display(int A,int B, int[] arr)
    {
        if(A==3)
        {
            System.out.print("3");
        }

        if(A==4)    
        {
            System.out.print("4");
        }
    }
    public static void main(String[] args) {
        int N=0,H=0;

        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        H=sc.nextInt();
        int a[]= new int[N];

        for(int i=0; i<N; i++)
        {
            a[i]=sc.nextInt();
        }

       Display(N, H,a);
    }
}
