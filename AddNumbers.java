import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a!=0)
		{
			b++;
			a--;
		}
		System.out.println("The sum is:"+b);
	}

}
