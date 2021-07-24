package queue;


public class QueueArray {
	private int a[];
	private int b;
	private int e;
	
	QueueArray(int len){
		a=new int[len];
		b=-1;
		e=-1;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int delete() {
		if(!isEmpty()) {
			return a[++b];
		}
		return 0;
	}
	
	public boolean isEmpty() {
		if(b==e) {
			System.out.print("Queue is empty:");
			b=-1;
			e=-1;
			return true;
		}
		return false;
	}
	
	public void insert(int data) {
		if(!isFull()) {
			a[++e]=data;
		}
	}
	
	public boolean isFull() {
		if(e==a.length-1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
}
