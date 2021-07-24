package list;

import node.SingleNode;

public class CSLL {
	
	private SingleNode head;
	private SingleNode tail;
	private int size;
	
	CSLL(){
		head=null;
		tail=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void createNode(int value) {
		SingleNode node=new SingleNode();
		node.setValue(value);
		node.setNext(node);
		head=node;
		tail=node;
		size+=1;
	}

	public boolean exists() {
		if(head!=null)
			return true;
		System.out.println("No node exists");
		return false;
	}
	
	public void traverse() {
		if(exists()) {
			SingleNode temp=head;
			do {
				System.out.print(temp.getValue());
				temp=temp.getNext();
			}while(temp!=head);
			System.out.println();
		}
	}
	
	public void insert(int pos, int value) {
		if(exists()) {
			SingleNode node=new SingleNode();
			node.setValue(value);
			if(pos==0) {
				node.setNext(head);
				tail.setNext(head);
				head=node;
			}else if(pos>=size) {
				node.setNext(head);
				tail.setNext(node);
				tail=node;
			}else {
				SingleNode temp=head;
				for(int i=0;i<pos-1;i++) {
					temp=temp.getNext();
				}
				node.setNext(temp.getNext());
				temp.setNext(node);
			}
			size+=1;
		}
	}
	
	public void delete(int pos) {
		if(exists()) {
			if(size==1) {
				head=tail=null;
				size-=1;
				return;
			}
			if(pos==0) {
				head=head.getNext();
				tail.setNext(head);
				size-=1;
			}else if(pos>=size) {
				SingleNode temp=head;
				for(int i=1;i<size-1;i++) {
					temp=temp.getNext();
				}
				temp.setNext(head);
				tail=temp;
				size-=1;
			}else {
				SingleNode temp=head;
				for(int i=1;i<pos-1;i++) {
					temp=temp.getNext();
				}
				temp.setNext(temp.getNext().getNext());
			}
		}
	}
}
