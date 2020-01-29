import java.util.Scanner;
import java.util.ArrayList;
public class LoopLinkedList {
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
public static LoopLinkedList insert(LoopLinkedList li,int data)
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
public static LoopLinkedList convert(LoopLinkedList li,int x)
{
	int count=1;
	Node temp=li.head;
	while(count!=x)
	{
		temp=temp.next;
		count++;
	}
	Node temp1=li.head;
	while(temp1.next!=null)
	{
		temp1=temp1.next;
	}
	if(count>1)
	{
	temp1.next=temp;
	}
	return li;
}
public static int check(LoopLinkedList li)
{
	ArrayList<Node>a=new ArrayList<Node>();
	Node temp=li.head;
	while(temp!=null)
	{
		if(a.contains(temp))
		{
			return 1;
		}
		else
		{
			a.add(temp);
		}
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		System.out.println("Enter the number of elements:");
		LoopLinkedList li=new LoopLinkedList();
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			li=li.insert(li, sc.nextInt());
		}
		System.out.println("Enter the position where you want to loop the linked list:");
		int x=sc.nextInt();
		li=convert(li,x);
		int s=check(li);
		if(s==0)
			System.out.println("False");
		else
			System.out.println("True");
	}
	}

}
