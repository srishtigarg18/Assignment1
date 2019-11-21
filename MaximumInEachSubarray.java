import java.util.Scanner;
public class MaximumInEachSubarray {
	public static void findMax(int arr[],int k)
	{
		int max=0;
		int n=arr.length;
		for(int i=0;i<=n-k;i++)
		{
			max=arr[i];
			for(int j=i+1;j<i+k;j++)
			{
				if(arr[j]>=max)
				{
					max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the subarray:");
		int k=sc.nextInt();
		if(k<=n)
		{
			System.out.println("The maximum element of each subarray is:");
		  findMax(arr,k);
		}
		else
		{
			System.out.println("The size given is greater than the length of array.");
		}
	}
}
