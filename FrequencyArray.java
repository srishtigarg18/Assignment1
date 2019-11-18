import java.util.Scanner;
public class FrequencyArray {
	public static void count(int arr[],int freq[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=0;
				}
			}
			if(freq[i]!=0)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(freq[i]!=0)
			{
				System.out.println(arr[i]+" occur "+freq[i]+" times");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]= new int[n];
		int freq[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			freq[i]=-1;
		}
		count(arr,freq);
	}

} 
