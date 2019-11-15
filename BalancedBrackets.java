import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets
{
	public static void check(String st) 
	{

		Stack<Character> stack1 = new Stack<Character>();
		int n = st.length();
		for (int i = 0; i < n; i++) 
		{
			if (st.charAt(i) == '{' || st.charAt(i) == '[' || st.charAt(i) == '(') {
				stack1.push(st.charAt(i));
			}
			if (!stack1.isEmpty()) 
			{
				if (st.charAt(i) == ')' && stack1.peek() == '(') {

					stack1.pop();
				} else if (st.charAt(i) == ']' && stack1.peek() == '[') {
					stack1.pop();
				} else if (st.charAt(i) == '}' && stack1.peek() == '{') {
					stack1.pop();
				}
			}

		}

		if (stack1.isEmpty())
		{
			System.out.println("BALANCED");
		}
		else 
		{
			System.out.println("NOT BALANCED");
		}
	}

	public static void main(String args[]) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		check(str);

	}

}
