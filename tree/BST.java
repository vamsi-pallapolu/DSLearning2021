package tree;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BST {
	BinaryNode root;
	
	BST(){
		root=null;
	}
	
	public void search(int data) {
		BinaryNode node=search(root, data);
		if(node==null)
			System.out.println("Data not found");
		else
			System.out.println("Data found:"+node.getData());
	}
	
	BinaryNode search(BinaryNode node, int data) {
		if(node==null)
			return null;
		if(node.getData()==data)
			return node;
		else if(data<node.getData())
			return search(node.getLeft(), data);
		else
			return search(node.getRight(), data);
		
	}
	
	void delete(int data) {
		this.root=deleteNode(root, data);
	}
	
	BinaryNode deleteNode(BinaryNode currentNode, int data) {
		if(currentNode==null)
			return null;
		if(data==currentNode.getData()) {
			//if it is a leaf node
			if(currentNode.getLeft() ==null && currentNode.getRight()==null) {
				currentNode=null;
			}
			//If it has one left child node
			else if(currentNode.getLeft()!=null && currentNode.getRight()==null) {
				currentNode=currentNode.getLeft();
			}
			//If it has 
			else if(currentNode.getLeft()==null && currentNode.getRight()!=null) {
				currentNode=currentNode.getRight();
			}
			//If it has two child nodes
			else {
				// find the leastNode in right subtree
				// copy the date to node to be deleted
				// delete the leastNode in right subtree
				BinaryNode min=minimumElement(currentNode.getRight());
				currentNode.setData(min.getData());
				BinaryNode right=deleteNode(currentNode.getRight(), min.getData());
				currentNode.setRight(right);
				
			}
			
		}
		else if(data<currentNode.getData()) {
			BinaryNode left=deleteNode(currentNode.getLeft(), data);
			currentNode.setLeft(left);
		}
		else {
			BinaryNode right=deleteNode(currentNode.getRight(), data);
			currentNode.setRight(right);
		}
		return currentNode;
	}
	
	BinaryNode minimumElement(BinaryNode node) {
		if(node.getLeft()==null)
			return node;
		return minimumElement(node.getLeft());
	}
	
	void traverse() {
		if(root==null) {
			System.out.println("No nodes exist");
			return;
		}
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode currentNode=queue.remove();
			System.out.println(currentNode.getData());
			if(currentNode.getLeft()!=null)
				queue.add(currentNode.getLeft());
			if(currentNode.getRight()!=null)
				queue.add(currentNode.getRight());
		}
		
	}
	
	void insert(int data) {
		this.root=bstInsert(root,data);
	}
	
	BinaryNode bstInsert(BinaryNode currentNode, int data) {
		if(currentNode==null) {
			BinaryNode node=new BinaryNode();
			node.setData(data);
			currentNode=node;
		}else if(data<=currentNode.getData()) {
			BinaryNode left=bstInsert(currentNode.getLeft(), data);
			currentNode.setLeft(left);
		}else {
			BinaryNode right=bstInsert(currentNode.getRight(), data);
			currentNode.setRight(right);
		}
		return currentNode;
	}
}
