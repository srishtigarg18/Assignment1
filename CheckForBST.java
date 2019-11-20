import java.util.ArrayList;
class Node {
	int key;
	Node left;
	Node right;

	Node(int d) {
		key = d;
		left = right = null;
	}
}
public class CheckForBST {
	static Node root;
	static ArrayList<Integer>a=new ArrayList<Integer>();
	CheckForBST()
	{
		root=null;
	}
	CheckForBST(int data)
	{
		root=new Node(data);
	}
	public static void insert(int key)
	{
		root=insertItem(root,key);
	}
	public static Node insertItem(Node root,int key)
	{
		//Scanner sc=new Scanner(System.in);
		//Node newNode=new Node(data);
		if(root==null)
		{
			root=new Node(key);
			return root;
			
		}
		else if(root.left==null)
		{
			root.left=insertItem(root.left,key);
		}
		else
		{
			root.right=insertItem(root.right,key);
		}
		return root;
	}
	public static void inOrder(Node temp) {
		if (temp != null) {
			
			inOrder(temp.left);
			System.out.print(temp.key+" ");
			a.add(temp.key);
			inOrder(temp.right);
		}
		return;
	}
	public static boolean check(ArrayList<Integer>a)
	{
		for(int i=0;i<a.size()-1;i++)
		{
			if(a.get(i)<a.get(i+1)) {
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		CheckForBST tree=new CheckForBST(100);
		tree.root.left=new Node(70);
		tree.root.right=new Node(60);
		tree.root.left.left=new Node(50);
		tree.root.left.right=new Node(40);
		tree.root.right.left=new Node(30);
		tree.root.right.right=new Node(80);
		System.out.println("The inorder of the tree is:");
		inOrder(root);
		System.out.println();
		if(check(a))
		{
			System.out.println("The Binary Tree is BST.");
		}
		else
		{
			System.out.println("The Binary Tree is not BST.");
		}
	}
}
