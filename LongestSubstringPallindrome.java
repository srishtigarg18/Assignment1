import java.util.Scanner;
public class LongestSubstringPallindrome
{
public static void longestSubstring(String str)
{
	int flag=0;
	String res="";
	String s1="";
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
			s1=str.substring(i,j);
			if(check(s1)==true)
			{
				if(s1.length()>res.length())
				{
					res=s1;
					flag=1;
					
				}
			}
		}
	}
	if(flag==0 || res.length()==1)
	{
		System.out.println("No such substring exists");
	}
	else
	{
		System.out.println("The longest pallindrome substring is:"+res);
	}
	
}
	public static boolean check(String s)
	{
		int j=s.length()-1;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				j--;
			}
			else
			{
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		longestSubstring(str);

	}

}
