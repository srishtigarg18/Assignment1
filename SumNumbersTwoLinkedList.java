import java.util.Scanner;
public class SumNumbersTwoLinkedList {
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
	public static SumNumbersTwoLinkedList insert(SumNumbersTwoLinkedList li,int data)
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
	public static SumNumbersTwoLinkedList sum(SumNumbersTwoLinkedList li1,SumNumbersTwoLinkedList li2)
	{
		int n1=0;
		int n2=0;
		int i=0;
		Node temp1=li1.head;
		while(temp1!=null)
		{
			n1=n1+(int)(temp1.data*Math.pow(10,i));
			i++;
			temp1=temp1.next;
		}
		i=0;
		Node temp2=li2.head;
		while(temp2!=null)
		{
			n2=n2+(int)(temp2.data*Math.pow(10,i));
			i++;
			temp2=temp2.next;
		}
		SumNumbersTwoLinkedList li=new SumNumbersTwoLinkedList();
		int sum=n1+n2;
		while(sum!=0)
		{
			li.insert(li, sum%10);
			sum=sum/10;
		}
		return li;
	}
	public static void display(SumNumbersTwoLinkedList li)
	{
		Node temp=li.head;
		System.out.println("Resultant List is:");
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumNumbersTwoLinkedList li1=new SumNumbersTwoLinkedList();
		SumNumbersTwoLinkedList li2=new SumNumbersTwoLinkedList();
		SumNumbersTwoLinkedList li3=new SumNumbersTwoLinkedList();
		System.out.println("Enter the number of elements in linked list 1:");
		int num1=sc.nextInt();
		System.out.println("Enter the elements in linked list 1:");
		for(int i=0;i<num1;i++)
		{
			li1.insert(li1,sc.nextInt());
		}
		System.out.println("Enter the number of elements in linked list 2:");
		int num2=sc.nextInt();
		System.out.println("Enter the elements of linked list 2:");
		for(int i=0;i<num2;i++)
		{
			li2.insert(li2,sc.nextInt());
		}
	  li3=sum(li1,li2);
	  display(li3);

	}
}
