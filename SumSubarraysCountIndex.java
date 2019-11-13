import java.util.Scanner;
public class SumSubarraysCountIndex {
	public static void sum(int arr[],int m)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+arr[k];
				}
				if(sum==m)
				{
					System.out.println("Starting index:"+i+",Ending index:"+j);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum:");
		int k=sc.nextInt();
       sum(arr,k);

	}
}
