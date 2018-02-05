import java.util.*;

class Node{
	int key;
	Node left, right;
	
	public Node(int data){
		key = data;
		left = right = null;
	}
}

class BinaryTree {
	
	static Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(scan.nextInt());
		tree.root.left = new Node(scan.nextInt());
		tree.root.right = new Node(scan.nextInt());
		tree.root.left.left = new Node(scan.nextInt());
		tree.root.right.right = new Node(scan.nextInt());
		
		tree.inorderTraversal(root);
		tree.preorderTraversal(root);
		tree.postorderTraversal(root);
		
	}

	void postorderTraversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null)
			return;
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.println("postorderTraversal: ");
		System.out.print(node.key +" ");
		
	}

	void preorderTraversal(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		System.out.println("preorderTraversal: ");
		System.out.println(node.key +" ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}

	void inorderTraversal(Node node) {
		// TODO Auto-generated method stub
		if(node == null)
			return;
		inorderTraversal(node.left);
		System.out.println("InorderTraversal: ");
		System.out.println(node.key + " ");
		inorderTraversal(node.right);
	}

}
