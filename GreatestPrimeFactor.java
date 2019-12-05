import java.util.Scanner;
public class GreatestPrimeFactor {

public static void find(int num)
{
	int max=1;
	int flag=0;
	for(int i=2;i<=num/2;i++)
	{
		flag=0;
		if(num%i==0)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				if(i>max)
				{
					max=i;
				}
			}
		}
		
	}
	System.out.println("The greatest prime factor of "+num+" is "+max);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		find(num);

	}

}
