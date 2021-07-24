package list;

import node.SingleNode;

public class SLL {
	
	SingleNode head;
	SingleNode tail;
	int size;
	
	SLL(){
		head=null;
		tail=null;
		size=0;
	}
	
	void createNode(int value) {
		SingleNode node=new SingleNode();
		node.setValue(value);
		node.setNext(null);
		head=node;
		tail=node;
		size+=1;
	}
	
	void traverse() {
		if(exists()) {
			SingleNode temp=head;
			for(int i=0;i<size;i++) {
				System.out.print(temp.getValue()+" ");
				temp=temp.getNext();
			}
			System.out.println();
		}
	}
	
	boolean exists() {
		if(head!=null)
			return true;
		System.out.println("No nodes exists");
		return false;
	}

	void insert(int value, int pos) {
		if(exists()) {
			SingleNode node=new SingleNode();
			node.setValue(value);
			if(pos==0) {
				node.setNext(head);
				head=node;
			}else if(pos>=size) {
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
		}else {
			System.out.println("No nodes present, create a node first");
		}
		
	}
	
	void delete(int pos) {
		if(exists()) {
			if(size==1) {
				System.out.println("\n"+head.getValue()+" deleted");
				head=tail=null;
				size-=1;
				return;
			}
			if(pos==0) {
				head=head.getNext();
				size-=1;
			}else if(pos>=size) {
				SingleNode temp=head;
				for(int i=1;i<size-1;i++)
					temp=temp.getNext();
				temp.setNext(null);
				tail=temp;
				size-=1;
			}else {
				SingleNode temp=head;
				for(int i=0;i<pos-1;i++)
					temp=temp.getNext();
				temp.setNext(temp.getNext().getNext());
				size-=1;
			}
		}
	}
	

}
