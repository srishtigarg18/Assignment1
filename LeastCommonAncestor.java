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
public class LeastCommonAncestor {
	static Node root;
	LeastCommonAncestor()
	{
		root=null;
	}
	LeastCommonAncestor(int data)
	{
		root=new Node(data);
	}
	public static Node LCA(Node root,int a,int b)
	{
		if(root==null||root.key==a|| root.key==b)
			return root;
		Node left=LCA(root.left,a,b);
		Node right=LCA(root.right,a,b);
		if(left!=null && right!=null)
		    return root;
		if(left!=null)
			return left;
		if(right!=null)
			return right;
		return null;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LeastCommonAncestor tree=new LeastCommonAncestor(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		System.out.println("Enter the nodes:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Node n=LCA(root,a,b);
		System.out.println("LCA of "+a+" and "+b+" is:"+n.key);
	}
}
