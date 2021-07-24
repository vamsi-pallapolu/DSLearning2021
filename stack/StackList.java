package stack;

import node.DoubleNode;

public class StackList {
	
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	StackList(){
		head=tail=null;
		size=0;
	}
	
	public int pop() {
		int data;
		if(exists()) {
			if(size==1) {
				data=tail.getData();
				head=tail=null;
				size--;
				return data;
			}
			data=tail.getData();
			tail=tail.getPrev();
			tail.setNext(null);
			size-=1;
			return data;
		}
		return 0;
	}
	
	public void traverse() {
		if(exists()) {
			DoubleNode temp=head;
			do {
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}while(temp!=null);
		}
	}
	
	public boolean exists() {
		if(head!=null)
			return true;
		System.out.print("No nodes exist:");
		return false;
	}
	
	public void push(int data) {
		DoubleNode node=new DoubleNode();
		node.setData(data);
		if(head==null) {
			node.setPrev(null);
			node.setNext(null);
			head=node;
			tail=node;
			size+=1;
			return;
		}
		node.setPrev(tail);
		tail.setNext(node);
		tail=node;
		size+=1;
	}
}
