import java.util.Scanner;
public class RotateLinkedList 
{
	Node head;
	public static class Node 
	{
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}
	public static RotateLinkedList insert(RotateLinkedList li, int data) 
	{
		Node newNode = new Node(data);
		newNode.next = null;
		if (li.head == null)
			li.head = newNode;
		else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return li;
	}
	public static RotateLinkedList rotate(RotateLinkedList li, int k)
	{
		int count = 0;
		while (count != k) {
			Node current = li.head;
			while (current.next.next != null) {
				current = current.next;
			}
			int num = current.next.data;
			current.next = null;
			Node newNode = new Node(num);
			newNode.next = li.head;
			li.head = newNode;
			count++;
		}
		return li;
	}
	public static void display(RotateLinkedList li) 
	{
		if (li.head == null) {
			System.out.println("Nothing to display");
		} else {
			Node temp = li.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args)
	{
		RotateLinkedList li = new RotateLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			li.insert(li, num);
		}
		System.out.println("Enter the number by which you want to rotate the Linked List:");
		int k = sc.nextInt();
		if (k <= n) {
			System.out.println("The Linked List before rotation:");
			li.display(li);
			rotate(li, k);
			System.out.println();
			System.out.println("The Linked List after rotation:");

			li.display(li);
		} else {
			System.out.println("Number greater than the length of linked list");
		}
	}
}
