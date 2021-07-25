package tree;

import node.BinaryNode;

public class BSTMain {
	
	public static void main(String[] args) {
		BST ob=new BST();
		ob.insert(40);
		ob.insert(20);
		ob.insert(50);
		ob.insert(45);
		ob.insert(60);
		ob.insert(55);
		ob.insert(65);
		
		ob.traverse();
		System.out.println("------------------");
		ob.delete(50);
		ob.delete(55);
		ob.traverse();
		
	}

}
