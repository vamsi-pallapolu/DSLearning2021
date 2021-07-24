package tree;

import node.BinaryNode;

public class BSTMain {
	
	public static void main(String[] args) {
		BST ob=new BST();
		ob.insert(40);
		ob.insert(10);
		ob.insert(45);
		
		ob.traverse();
		System.out.println("------------------");
		ob.delete(10);
		ob.delete(40);
		ob.delete(45);
		ob.traverse();
		
	}

}
