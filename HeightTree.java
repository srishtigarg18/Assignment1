import java.util.Scanner;
 class Node {
	int key;
	Node left;
	Node right;

	Node(int d) {
		key = d;
		left = right = null;
	}
 }
public class HeightTree {
	static Node root;
	HeightTree()
	{
		root=null;
	}
	HeightTree(int data)
	{
		root=new Node(data);
	}
	public static void insert(int key)
	{
		root=insertItem(root,key);
	}
	public static Node insertItem(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
			
		}
		else if(root.key>key)
		{
			root.left=insertItem(root.left,key);
		}
		else if(root.key<key)
		{
			root.right=insertItem(root.right,key);
		}
		return root;
		
	}
	void inOrder(Node temp) {
		if (temp != null) {
			
			inOrder(temp.left);
			System.out.println(temp.key);
			inOrder(temp.right);
		}
		return;
	}
	public static int heightTree(Node root)
	{
		 int count1=0;
		 int count2=0;
		if(root==null)
			return 0;
				count1=heightTree(root.left);
				count1++;
				count2=heightTree(root.right);
				count2++;
				if(count1>=count2)
					return count1;
				else
					return count2;
				
		}
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		HeightTree btree=new HeightTree();
		Scanner sc=new Scanner(System.in);
 		System.out.println("Entrer the number of elements:");
		int n=sc.nextInt();
		System.out.println("Entrer the elements:");
		for(int i=0;i<n;i++)
		{
			insert(sc.nextInt());
		}
		System.out.println("The Inorder is:");
		btree.inOrder(root);
		int h=btree.heightTree(root);
		h=h-1;
		System.out.println("The height of the tree is:"+h);
	}
}


