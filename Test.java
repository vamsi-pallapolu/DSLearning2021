import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class Test {

	BinaryNode root;
	
	Test(){
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
	
	public void delete(int data) {
		this.root=deleteNode(root, data);
	}
	
	BinaryNode deleteNode(BinaryNode currentNode, int data) {
		if(data==currentNode.getData()) {
			if(currentNode.getLeft()==null && currentNode.getRight()==null)
				currentNode=null;
			else if(currentNode.getLeft()==null && currentNode.getRight()!=null)
				currentNode=currentNode.getRight();
			else if(currentNode.getRight()==null && currentNode.getLeft()!=null)
				currentNode=currentNode.getRight();
			else {
				BinaryNode minNode=minimumValue(currentNode.getRight());
				currentNode.setData(minNode.getData());
				BinaryNode right=deleteNode(currentNode.getRight(), minNode.getData());
				currentNode.setRight(right);
			}
		}
		else if(data<currentNode.getData()) {
			BinaryNode left=deleteNode(currentNode.getLeft(), data);
			currentNode.setLeft(left);
		}else {
			BinaryNode right=deleteNode(currentNode.getRight(), data);
			currentNode.setRight(right);
		}
		return currentNode;
	}
	
	BinaryNode minimumValue(BinaryNode node) {
		if(node.getLeft()==null)
			return node;
		return minimumValue(node.getLeft());
	}
	
	public void traverse() {
		if(exists()) {
			Queue<BinaryNode> queue=new LinkedList<>();
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
	}
	
	public boolean exists() {
		if(root!=null)
			return true;
		return false;
	}
	
	public void insert(int data) {
		this.root=insertNode(root, data);
	}
	
	BinaryNode insertNode(BinaryNode currentNode, int data) {
		if(currentNode==null) 
			currentNode=createNode(data);
		else if(data<currentNode.getData()) {
			BinaryNode left=insertNode(currentNode.getLeft(), data);
			currentNode.setLeft(left);
		}else {
			BinaryNode right=insertNode(currentNode.getRight(), data);
			currentNode.setRight(right);
		}
		return currentNode;
	}
	
	BinaryNode createNode(int data) {
		BinaryNode node=new BinaryNode();
		node.setData(data);
		return node;
	}
}
