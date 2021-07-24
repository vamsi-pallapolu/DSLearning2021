package queue;

import node.SingleNode;

public class QueueList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	QueueList(){
		head=tail=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean exists() {
		if(head!=null)
			return true;
		return false;
	}
	
	public void enqueue(int data) {
		SingleNode node=new SingleNode();
		node.setValue(data);
		if(head==null) {
			node.setNext(null);
			head=tail=node;
			size+=1;
			return;
		}
		tail.setNext(node);
		tail=node;
		size++;
	}
	
	public int dequeue() {
		if(exists()) {
			int data=head.getValue();
			head=head.getNext();
			size--;
			return data;
		}
		return 0;
	}
}
