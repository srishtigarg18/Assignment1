import java.util.Scanner;
public class ArrayPairsSumX {
	public static void pairs(int arr1[],int arr2[],int X)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]+arr2[j]==X)
					System.out.println(arr1[i]+" "+arr2[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number of elements in array2:");
		int num2=sc.nextInt();
		System.out.println("Enter the value of X:");
		int X=sc.nextInt();
		System.out.println("Enter the elements in array1:");
		int arr1[]=new int[num1];
		for(int i=0;i<num1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements in array2:");
		int arr2[]=new int[num1];
		for(int i=0;i<num1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("The pairs are:");
		pairs(arr1,arr2,X);
	}

}
