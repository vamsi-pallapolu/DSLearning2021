package tree;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BinaryTree {

	BinaryNode root;

	BinaryTree() {
		root = null;
	}

	public void delete(int value) {
		// Search for the node to be deleted
		// Find the deepest node
		// Copy the data from the deepest node to present node
		// delete the deepest node
		if(exists()) {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode=null;
			while (!queue.isEmpty()) {
				presentNode=queue.remove();
				if(presentNode.getData()==value) {
					presentNode.setData(getDeepestNode().getData());
					deleteDeepestNode();
					return;
				}
				if (presentNode.getLeft() != null)
					queue.add(presentNode.getLeft());
				if (presentNode.getRight() != null)
					queue.add(presentNode.getRight());
			}
		}
	}
	
	public void deleteDeepestNode() {
		if(root.getLeft()==null && root.getRight()==null) {
			root=null;
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode, presentNode=null;
		while (!queue.isEmpty()) {
			previousNode=presentNode;
			presentNode=queue.remove();
			if (presentNode.getLeft()==null) {
				previousNode.setRight(null);
				return;
			}
			else if (presentNode.getRight() == null) {
				presentNode.setLeft(null);
				return;
			}
			else {
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		}
	}

	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode currentNode = null;
		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			if (currentNode.getLeft() != null)
				queue.add(currentNode.getLeft());
			if (currentNode.getRight() != null)
				queue.add(currentNode.getRight());
		}
		return currentNode;
	}

	public void traverse() {
		if (exists()) {
			// Level Order Traversal
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode currentNode = queue.remove();
				System.out.println(currentNode.getData());
				if (currentNode.getLeft() != null)
					queue.add(currentNode.getLeft());
				if (currentNode.getRight() != null)
					queue.add(currentNode.getRight());
			}
		} else {
			System.out.println("No nodes exist");
		}
	}

	public boolean exists() {
		if (root != null)
			return true;
		return false;
	}

	public void insert(int data) {
		BinaryNode node = new BinaryNode();
		node.setData(data);
		if (root == null) {
			root = node;
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode currentNode = queue.remove();
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(node);
				return;
			} else if (currentNode.getRight() == null) {
				currentNode.setRight(node);
				return;
			} else {
				queue.add(currentNode.getLeft());
				queue.add(currentNode.getRight());
			}
		}
	}

}
