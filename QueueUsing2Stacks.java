public class QueueUsing2Stacks {
	Node top;

	static class Node {
		int data;
		Node link;
	}

	QueueUsing2Stacks() {
		this.top = null;
	}

	public void push(int temp) {
		Node newNode = new Node();
		if (newNode == null) {
			System.out.println("**Stack Overflow**");
			return;
		}
		newNode.data = temp;
		newNode.link = top;
		top = newNode;
		//System.out.println(temp + " has been pushed");
	}

	public void pop() {
		if (top == null) {
			System.out.println("**Stack UnderFlow");
			return;
		}
		//System.out.println(top.data + " has been popped");
		top = top.link;
	}

	public int peek() {
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}
	public static QueueUsing2Stacks enQueue(int data,QueueUsing2Stacks s1)
	{
		QueueUsing2Stacks s2=new QueueUsing2Stacks();
		Node temp=s1.top;
		while(temp!=null)
		{ 
			s2.push(temp.data);
			temp=temp.link;
			s1.pop();
		}
		s1.push(data);
		Node temp1=s2.top;
		while(temp1!=null)
		{
			s1.push(temp1.data);
			temp1=temp1.link;
			s2.pop();
		}
		return s1;
	}
	public static QueueUsing2Stacks dequeue(QueueUsing2Stacks s1)
	{
		s1.pop();
		return s1;
	}
	void display() {
		if (top == null) {
			System.out.println("**Stack Underflow**");
		} else {
			Node traversal = top;
			System.out.println("The Queue is:");
			while (traversal.link != null) {
				System.out.printf("%d-->", traversal.data);
				traversal = traversal.link;
			}
			System.out.println(traversal.data);
		}
	}

	public static void main(String[] args) {
		QueueUsing2Stacks s1=new QueueUsing2Stacks();
		s1.enQueue(10,s1);
		s1.enQueue(20,s1);
		s1.dequeue(s1);
		s1.enQueue(30,s1);
		s1.display();
	}

}
