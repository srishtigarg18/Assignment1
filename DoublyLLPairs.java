import java.util.Scanner;
public class DoublyLLPairs {
	Node head;
	Node tail;
	public static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data=d;
		}
	}
	public static DoublyLLPairs insert(DoublyLLPairs li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		newNode.prev=null;
		if(li.head == null)
		{
		li.head=newNode;
		newNode.prev=null;
		li.tail=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			newNode.prev=last;
			last.next=newNode;
			li.tail=newNode;
		}
		return li;
	}
	public static void find(DoublyLLPairs li,int sum)
	{
		Node fr=li.head;
		Node prev1=li.tail;
		int flag=0;
		while(fr!=prev1 && fr!=null && prev1!=null && prev1.next!=fr )
		{
			if((fr.data+prev1.data)==sum)
			{
				System.out.println("("+prev1.data+","+fr.data+")");
				fr=fr.next;
				prev1=prev1.prev;
				flag=1;
			}
			if((fr.data+prev1.data)>sum)
			{
				prev1=prev1.prev;
			}
			else if((fr.data+prev1.data)<sum) 
			{
				fr=fr.next;
			}
				
		}
		if(flag==0)
		{
			System.out.println("No such pair exists");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		DoublyLLPairs li=new DoublyLLPairs();
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			li=li.insert(li, sc.nextInt());
		}
		System.out.println("Enter the sum:");
		int x=sc.nextInt();
		System.out.println("The pairs are:");
		find(li,x);
	}

}
