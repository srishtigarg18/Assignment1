import java.util.Scanner;
public class ReverseWords {
	public static void reverse(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == '.') 
			{
				count++;
			}
		}
		int j = 0;
		String s[] = new String[count + 1];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = "";
			while (j < str.length() && str.charAt(j) != '.')
			{
				s[i] = s[i] + str.charAt(j);
				j++;
			}
			j++;
		}
		String res = "";
		int k = 0;
		for (k = s.length - 1; k > 0; k--)
		{
			res = res + s[k] + ".";
		}
		res = res + s[k];
		System.out.println(res);

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of test cases:");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) 
		{
			System.out.println("Enter the string:");
			String str = sc.next();
			reverse(str);
		}

	}

}
