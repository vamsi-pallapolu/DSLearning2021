package tree;

import node.BinaryNode;

public class AVLTreeMain {
	
	public static void main(String[] args) {
		AVLTree at=new AVLTree();
		at.insert(20);
		at.insert(10);
		at.insert(15);
		at.insert(25);
		at.insert(30);
		at.traverse();
		
	}

}
