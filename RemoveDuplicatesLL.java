import java.util.Scanner;
public class RemoveDuplicatesLL 
{
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
public static RemoveDuplicatesLL insert(RemoveDuplicatesLL li,int data)
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
public static void display(RemoveDuplicatesLL li)
{
	Node temp=li.head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
public static void remove(RemoveDuplicatesLL li)
{
	Node current=li.head;
	Node temp=li.head;
	while(temp.next!=null)
	{
	  current=temp;
	     temp=temp.next;
	while(current.data==temp.data && temp.next!=null)
	{
		temp=temp.next;
	}
	current.next=temp;
	}
	if(current.data==temp.data)
	{
		current.next=temp.next;
	}
}

public static void main(String args[])
{
	RemoveDuplicatesLL li=new RemoveDuplicatesLL();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++)
	{
		li.insert(li, sc.nextInt());
	}
	System.out.println("Linked List is:");
	li.display(li);
	System.out.println();
	System.out.println("Linked List after removing duplicates is:");
	li.remove(li);
	li.display(li);
	
}
}
