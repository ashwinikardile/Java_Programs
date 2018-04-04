import java.util.*;

class TreeNode {
	int data;
	TreeNode left, right;
	
	public TreeNode(int key) {
		data = key;
	}
}

public class LowestCommonAncestor {
	TreeNode root;
	
	TreeNode findLCA(int i, int j) {
		// TODO Auto-generated method stub
		return findLCA(root, i, j);
	}
	
	TreeNode findLCA(TreeNode node, int i, int j) {
		// TODO Auto-generated method stub
		if(node == null)
			return null;
		if(node.data == i || node.data == j)
			return node;
		TreeNode left_subtree = findLCA(node.left, i, j);
		TreeNode right_subtree = findLCA(node.right, i ,j);
		
		if(left_subtree != null && right_subtree != null)
			return node;
		
		return (left_subtree != null) ? left_subtree : right_subtree;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new TreeNode(scan.nextInt());
		tree.root.left = new TreeNode(scan.nextInt());
		tree.root.right = new TreeNode(scan.nextInt());
		tree.root.left.left = new TreeNode(scan.nextInt());
		tree.root.left.right = new TreeNode(scan.nextInt());
		tree.root.right.left = new TreeNode(scan.nextInt());
		tree.root.right.right = new TreeNode(scan.nextInt());
		
		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).data);
		System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
		System.out.println("LCA(1, 6) = " + tree.findLCA(1, 6).data);
	}
	

}
