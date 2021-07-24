package tree;

public class BinaryTreeArray {
	
	private int a[];
	int last_index;
	
	BinaryTreeArray(int size){
		a=new int[size];
		last_index=0;
	}
	
	int search(int data) {
		for(int i=1;i<=last_index;i++) {
			if(a[i]==data) {
				return i;
			}
		}
		return 0;
	}
	
	public void delete(int data) {
		//search the node
		int pos=search(data);
		//copy the last node data
		a[pos]=a[last_index];
		//delete last node
		last_index--;
	}
	
	public void postOrder(int index) {
		if(index>last_index)
			return;
		postOrder(2*index);
		postOrder(2*index+1);
		System.out.println(a[index]);
	}
	
	public void preOrder(int index) {
		if(index>last_index)
			return;
		System.out.println(a[index]);
		preOrder(2*index);
		preOrder(2*index+1);
	}
	
	public void inOrder(int index) {
		if(index>last_index)
			return;
		inOrder(2*index);
		System.out.println(a[index]);
		inOrder(2*index+1);
	}
	
	public void traverse() {
		for(int i=1;i<=last_index;i++)
			System.out.println(a[i]);
	}
	
	public void insert(int data) {
		if(last_index==a.length-1) {
			System.out.println("Array is full");
			return;
		}
		a[++last_index]=data;
	}

}
