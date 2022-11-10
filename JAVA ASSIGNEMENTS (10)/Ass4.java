import java.util.*;
class Pattern
{
	public void Pattern(int no)
	{
		
		
		for(int i=0;i<no;i++)
		{
					
			for(int j=0;j<no;j++)
			{
				if((i==j)||(i>j))
				{
					System.out.print("*\t");
				}
				
				
						
			}
			
			
			System.out.println();
		}
		
	}
}

class Ass4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the number:");
		int no=sobj.nextInt();

		Pattern obj=new Pattern();

		obj.Pattern(no);
	}
}	
