package node;

public class SingleNode {
	
	private int value;
	private SingleNode next;
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(SingleNode next) {
		this.next=next;
	}
	
	public SingleNode getNext() {
		return next;
	}

}
