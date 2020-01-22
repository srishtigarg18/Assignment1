import java.util.Scanner;
public class LeaderInArray {
public static void find(int arr[])
{
	int flag=0;
	for(int i=0;i<arr.length-1;i++)
	{
		flag=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println(arr[arr.length-1]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int num;
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		find(arr);

	}

}
