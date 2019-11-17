import java.util.Scanner;
public class RemoveDuplicatesLinkedList {
	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
		
	}
	public static RemoveDuplicatesLinkedList insert(RemoveDuplicatesLinkedList li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		int flag=0;
		if(li.head == null)
		li.head=newNode;
		else
		{
			Node temp=li.head;
			while(temp!=null)
			{
				if(temp.data==data)
				{
					flag=1;
					break;
				}
				temp=temp.next;
			}
			if(flag==0)
			{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
			}
		}
		return li;
	}
	public static void display(RemoveDuplicatesLinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesLinkedList li=new RemoveDuplicatesLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of linked list:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			insert(li, num);
		}
		System.out.println("The linked list after removing duplicates is:");
		display(li);

	}
}
