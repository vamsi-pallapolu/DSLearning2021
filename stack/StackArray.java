package stack;

public class StackArray {
	
	private int a[];
	private int size;
	
	StackArray(int len){
		a=new int[len];
		size=-1;
	}
	
	boolean isFull() {
		if(size==a.length-1) {
			System.out.println("Array is full");
			return true;
		}
		return false;
	}
	
	void push(int data) {
		if(!isFull()) 
			a[++size]=data;
	}
	
	boolean isEmpty() {
		if(size==-1) {
			System.out.print("No elements in array:");
			return true;
		}
		return false;
	}
	
	int pop() {
		if(!isEmpty()) 
			return a[size--];
		return 0;
	}
}
