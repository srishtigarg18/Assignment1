import java.util.Scanner;
public class CountSubarrayWithMaximumElement {
public static void countMax(int arr[],int m)
{
	int count=0,max=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i;j<arr.length;j++)
		{
			max=0;
			for(int k=i;k<=j;k++)
			{
				if(arr[k]>max)
				{
					max=arr[k];
				}
			}
			if(max>m)
			{
				count++;
			}
		}
	}
	if(count==0)
		System.out.println("No such subarray exists");
	else
		System.out.println("Number of subarrays having maximum element greater than k are:"+count);
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
		System.out.println("Enter the value of k:");
		int k=sc.nextInt();
		countMax(arr,k);
	}

}
