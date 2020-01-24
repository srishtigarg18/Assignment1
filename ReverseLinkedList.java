import java.util.Scanner;
public class ReverseLinkedList {
	Node head;
	public static class Node
	{
		String data;
		Node next;
		Node(String d)
		{
			data=d;
		}
		
	}
	public static ReverseLinkedList insert(ReverseLinkedList li,String data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head == null)
		li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static void display(ReverseLinkedList li)
	{
		Node temp=li.head;
		System.out.println("LinkedList is:");
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	public static void reverse(Node temp)
	{
		if(temp==null)
		{
			System.out.println("LL does not exist");
		return;
		}
		
		if(temp.next==null)
		{
			System.out.println("The reversed list is:");
			
		}
		else
		{
			reverse(temp.next);
			System.out.print(temp.data+"->");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList li=new ReverseLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			li.insert(li,s);
		}
		li.display(li);
		System.out.println();
		li.reverse(li.head);
		System.out.print("NULL");
	}

}
