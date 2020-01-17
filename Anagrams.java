import java.util.Scanner;
public class Anagrams {
public static void check(String st1,String st2)
{
	int count=0;
	st1=st1.toLowerCase();
	st2=st2.toLowerCase();
	if(st1.length()==st2.length())
	{
		for(int i=0;i<st1.length();i++)
		{
			for(int j=0;j<st2.length();j++)
			{
				if(st1.charAt(i)==st2.charAt(j)){
					count++;
					st2=st2.replace(st2.charAt(j),' ');
					break;
				}
			}
		}
	}
	if(count==st1.length())
	{
		System.out.println("Anagrams");
	}
	else
	{
		System.out.println("Not Anagrams");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String st1=sc.next();
		System.out.println("Enter the second string:");
		String st2=sc.next();
		check(st1,st2);

	}

}
