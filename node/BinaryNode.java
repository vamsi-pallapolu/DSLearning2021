package node;

public class BinaryNode {
	private BinaryNode left;
	private BinaryNode right;
	private int data;
	
	
	private int height;
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
