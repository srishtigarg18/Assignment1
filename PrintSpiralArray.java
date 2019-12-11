import java.util.Scanner;
public class PrintSpiralArray {
	public static void print(int arr[][],int r,int c)
	{
		int a=0,b=0;
		while(a<r&&b<c)
		{
			for(int i=b;i<c;i++)
				System.out.print(arr[a][i]+" ");
			a++;
			for(int i=a;i<r;i++)
				System.out.print(arr[i][c-1]+" ");
			c--;
			if(a<r)
			{
				for(int i=c-1;i>=b;i--)
					System.out.print(arr[r-1][i]+" ");
				r--;
			}
			if(b<c)
			{
				for(int i=r-1;i>=a;i--)
					System.out.print(arr[i][b]+" ");
				b++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		print(arr,r,c);

	}

}
