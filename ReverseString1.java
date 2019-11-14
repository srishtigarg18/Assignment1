import java.util.Scanner;
public class ReverseString1 {
public static void reverse(String str)
{
	char c[]=str.toCharArray();
	int len=c.length;
	int j=len-1;
	int i=0;
	while(i<=len/2 && j>=0)
	{
		if((c[i]<'a' ||c[i]>'z')&&(c[i]<'A'||c[i]>'Z'))
		{
			i++;
		}
		if((c[j]<'a' ||c[j]>'z')&&(c[j]<'A'||c[j]>'Z'))
		{
			j--;
		}
		else
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			j--;
			i++;
		}
	}
	System.out.println("The reversed string is:");
	for(int k=0;k<len;k++)
	{
		System.out.print(c[k]);
	}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		reverse(str);
	}

}
