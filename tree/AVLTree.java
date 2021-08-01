package tree;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class AVLTree {
	
	BinaryNode root;
	
	//Creation of AVL Tree
	AVLTree(){
		root=null;
		
	}
	
	//Searching
	public void search(int data) {
		BinaryNode node=search(root, data);
		if(node==null)
			System.out.println("Data "+data+" not found");
		else
			System.out.println("Data "+data+" found");
	}
		
	private BinaryNode search(BinaryNode node, int data) {
		if(node==null)
			return null;
		if(data==node.getData())
			return node;
		else if(data<node.getData())
			return search(node.getLeft(), data);
		else
			return search(node.getRight(), data);
	}
		
	//traversing
	void traverse() {
		if(exists()) {
			Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty()) {
				BinaryNode node=queue.remove();
				System.out.println(node.getData()+":"+node.getHeight());
				if(node.getLeft()!=null)
					queue.add(node.getLeft());
				if(node.getRight()!=null)
					queue.add(node.getRight());
			}
		}
		System.out.println();
	}
	
	boolean exists() {
		if(root!=null)
			return true;
		return false;
	}
	
	
	
	int getBalance(BinaryNode node) {
		if(node==null)
			return 0;
		return height(node.getLeft())-height(node.getRight());
		
	}
	
	int height(BinaryNode node) {
		if(node==null)
			return 0;
		return 1+node.getHeight();
		
	}
	
	private int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	
	
	private BinaryNode insertNode(BinaryNode currentNode, int data) {
		System.out.println("---------------------------");
		if(currentNode==null) {
			currentNode=createNode(data);
		}
		else if(data<currentNode.getData())
			currentNode.setLeft(insertNode(currentNode.getLeft(), data));
		else if(data>currentNode.getData())
			currentNode.setRight(insertNode(currentNode.getRight(), data));
		else 
			return currentNode;
		
		int height=max(height(currentNode.getLeft()), height(currentNode.getRight()));
		System.out.println("height:"+height);
		
		currentNode.setHeight(height);
		
		int balance=getBalance(currentNode);
		System.out.println("balance:"+balance);
		if(balance > 1) {
			//LL Condition
			if(data < currentNode.getLeft().getData())
				currentNode=rotateRight(currentNode);
			//LR condition
			else if(data > currentNode.getLeft().getData()){
				BinaryNode left=rotateLeft(currentNode.getLeft());
				currentNode.setLeft(left);
				currentNode=rotateRight(currentNode);
				
			}
		}else if(balance < -1) {
			//RR Condition
			if(data > currentNode.getRight().getData())
				currentNode=rotateLeft(currentNode);
			//RL condition
			else if(data < currentNode.getRight().getData()){
				BinaryNode right=rotateRight(currentNode.getLeft());
				currentNode.setRight(right);
				currentNode=rotateLeft(currentNode);
			}
		}
		return currentNode;
	}
	
	
	//Insertion 
	void insert(int data) {
		this.root=insertNode(root, data);
	}
	
	BinaryNode rotateLeft(BinaryNode cdn) {
		BinaryNode newRoot=cdn.getRight();
		cdn.setRight(cdn.getRight().getLeft());
		newRoot.setLeft(cdn);
		int height=max(height(cdn.getLeft()), height(cdn.getRight()));
		cdn.setHeight(height);
		height=max(height(newRoot.getLeft()), height(newRoot.getRight()));
		newRoot.setHeight(height);
		return newRoot;
	}
	
	BinaryNode rotateRight(BinaryNode cdn) {
		BinaryNode newRoot=cdn.getLeft();
		cdn.setLeft(cdn.getLeft().getRight());
		newRoot.setRight(cdn);
		int height=max(height(cdn.getLeft()), height(cdn.getRight()));
		cdn.setHeight(height);
		height=max(height(newRoot.getLeft()), height(newRoot.getRight()));
		newRoot.setHeight(height);
		return newRoot;
	}
	
	//Creation of binaryNode
	private BinaryNode createNode(int data) {
		BinaryNode node=new BinaryNode();
		node.setData(data);
		return node;
	}

}
