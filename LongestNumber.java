import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LongestNumber {
public static long form(String s)
{
	String str[]=s.split(" ");
	Arrays.sort(str,Collections.reverseOrder());
	String num="";
	for(int i=0;i<str.length;i++)
	{
		num=num+str[i];
	}
	long max=Long.parseLong(num);
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		String s=sc.nextLine();
		System.out.println("Largest number formed is:"+form(s));

	}

}
