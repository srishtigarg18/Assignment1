import java.util.Scanner;
public class SecondLargest {
public static void find(int arr[])
{
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max1)
		{
			max1=arr[i];
		}
		
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max2 && arr[i]!=max1)
		{
			max2=arr[i];
		}
		
	}
	System.out.println("Largest - "+max1);
	System.out.println("Second - "+max2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		find(arr);
	}


}
