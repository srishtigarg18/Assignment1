import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook 
{
	
	public static void find(HashMap<String,String>m)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of queries:");
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("Enter name:");
			String name=sc.nextLine();
		if(m.get(name)!=null)
		{
			System.out.println(name+"="+m.get(name));
		}
		else
		{
			System.out.println("Not Found");
		}
		}
	}

	public static void main(String[] args) 
	{
		HashMap<String,String> m=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of enteries:");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter the Phone number:");
			String phone=sc.nextLine();
			m.put(name, phone);
		}
		find(m);
	}

}
