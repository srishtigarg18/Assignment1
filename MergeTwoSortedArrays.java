import java.util.Scanner;
public class MergeTwoSortedArrays {
	public static void merge(int arr1[],int arr2[])
	{
		int i=0,j=0,k=0;
		int arr3[]=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		System.out.println("The mergerd array is:");
		for(int m=0;m<arr3.length;m++)
		{
			System.out.print(arr3[m]+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of array1:");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements of array1 in sorted order:");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements of array2:");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter the elements of array2 in sorted order:");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		merge(arr1,arr2);
		// TODO Auto-generated method stub

	}

}
