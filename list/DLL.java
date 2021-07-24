package list;

import node.DoubleNode;

public class DLL {
	
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	DLL(){
		head=tail=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void createNode(int data) {
		DoubleNode node=new DoubleNode();
		node.setData(data);
		node.setNext(null);
		node.setPrev(null);
		head=tail=node;
		size+=1;
	}

	 boolean exists(){
		if(head!=null)
			return true;
		System.out.println("No nodes exist");
		return false;
	}
	
	public void traverse() {
		if(exists()) {
			DoubleNode temp=head;
			do {
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}while(temp!=null);
			System.out.println();
		}
	}
	
	public void insert(int pos, int data) {
		if(exists()) {
			DoubleNode node=new DoubleNode();
			node.setData(data);
			if(pos==0) {
				node.setNext(head);
				head.setPrev(node);
				head=node;
				size+=1;
			}else if(pos>=size) {
				node.setPrev(tail);
				tail.setNext(node);
				tail=node;
				size+=1;
			}else {
				DoubleNode temp=head;
				for(int i=0;i<pos-1;i++) {
					temp=temp.getNext();
				}
				node.setPrev(temp);
				node.setNext(temp.getNext());
				temp.getNext().setPrev(node);
				temp.setNext(node);
				size+=1;
			}
		}
	}
	
	public void delete(int pos) {
		if(exists()) {
			if(size==1) {
				head=tail=null;
				size-=1;
				return;
			}
			if(size==2) {
				tail=tail.getPrev();
				tail.setNext(null);
				size-=1;
				return;
			}
			if(pos==0) {
				head=head.getNext();
				head.setPrev(null);
				size-=1;
			}else if(pos>=size) {
				tail=tail.getPrev();
				tail.setNext(null);
				size-=1;
			}else {
				DoubleNode temp=head;
				for(int i=0;i<pos-1;i++) {
					temp=temp.getNext();
				}
				temp.getNext().getNext().setPrev(temp);
				temp.setNext(temp.getNext().getNext());
				size-=1;
			}
		}
	}
	
}
