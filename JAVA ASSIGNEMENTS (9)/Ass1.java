import java.util.*;
class Count
{
	public void Count(String text)
	{
		//char Arr[]=str.toCharArray();
		int countWords=0;
		 for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                countWords++;
        }
         
        System.out.println("Total number of words in string are: "+ (countWords+1));
		
}
}

class Ass1
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string:");
		String str=sobj.nextLine();
		Count obj=new Count();
		obj.Count(str);
	}
}


