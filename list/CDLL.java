package list;

import node.DoubleNode;

public class CDLL {
	
	
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	CDLL(){
		head=tail=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void createNode(int data) {
		DoubleNode node=new DoubleNode();
		node.setData(data);
		node.setNext(node);
		node.setPrev(node);
		head=tail=node;
		size+=1;
	}
	
	public boolean exists() {
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
			}while(temp!=head);
			System.out.println();
		}
	}
	
	public void reverse() {
		if(exists()) {
			DoubleNode temp=tail;
			do {
				System.out.print(temp.getData()+" ");
				temp=temp.getPrev();
			}while(temp!=tail);
			System.out.println();
		}
	}
	
	public void insert(int pos, int data) {
		if(exists()) {
			DoubleNode node=new DoubleNode();
			node.setData(data);
			if(pos==0) {
				node.setNext(head);
				node.setPrev(tail);
				head.setPrev(node);
				head=node;
				tail.setNext(head);
			}else if(pos>=size) {
				node.setNext(head);
				node.setPrev(tail);
				tail.setNext(node);
				tail=node;
				head.setPrev(tail);
			}else {
				DoubleNode temp=head;
				for(int i=0;i<pos-1;i++)
					temp=temp.getNext();
				node.setNext(temp.getNext());
				node.setPrev(temp);
				temp.getNext().setPrev(node);
				temp.setNext(node);
			}
			size+=1;
		}
	}
	
	public void delete(int pos) {
		if(exists()) {
			if(size==1) {
				head.setPrev(null);
				head.setNext(null);
				head=tail=null;
				size-=1;
				return;
			}
			if(pos==0) {
				head=head.getNext();
				head.setPrev(tail);
				tail.setNext(head);
				size-=1;
			}else if(pos>=size) {
				tail=tail.getPrev();
				tail.setNext(head);
				head.setPrev(tail);
				size-=1;
			}else {
				DoubleNode temp=head;
				for(int i=0;i<pos-1;i++)
					temp=temp.getNext();
				temp.getNext().getNext().setPrev(temp);
				temp.setNext(temp.getNext().getNext());
				size-=1;
			}
			
		}
	}

}
