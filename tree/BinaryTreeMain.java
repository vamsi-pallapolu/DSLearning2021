package tree;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.traverse();
		tree.deleteDeepestNode();
		System.out.println("DeepestNode:"+tree.getDeepestNode().getData());
		
		tree.delete(10);
		tree.delete(20);
		//tree.delete(30);
		System.out.println(tree.root.getLeft());
		System.out.println(tree.root.getRight());
		System.out.println(tree.root.getData());
		tree.delete(40);
		tree.traverse();
		
	}

}
