import java.util.Scanner;
public class InsertAtMid {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	 Node head;
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	 void insertAtMid(int num,int size)
	{
		int count;
		int mid=size/2;
		if(size%2!=0)
		{
			count=0;
		}
		else
			count=1;
		Node current=head;
		Node temp=new Node(num);
		while(current!=null && count<mid)
		{
			count++;
			current=current.next;
		}
		Node temp1=current.next;
		current.next=temp;
		temp.next=temp1;
	}
	 void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtMid im=new InsertAtMid();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			im.insert(sc.nextInt());
		}
		System.out.println("Linked list is:");
		im.display();
		System.out.println();
		System.out.println("Enter the element you want to insert:");
		int num=sc.nextInt();
		im.insertAtMid(num,n);
		System.out.println("Linked list after insertion is:");
		im.display();

	}

}
