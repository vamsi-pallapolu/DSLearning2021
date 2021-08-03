package tree;

public class BinaryHeapArray {
	
	int a[];
	int size;
	
	BinaryHeapArray(int len){
		a=new int[len];	
		size=0;
	}
	
	private void heapifyTtoB(int p) {
		int c1=2*p;
		int c2=2*p+1;
		int c;
		
		//No children
		if(c1>size)
			return;
		
		// if there is only one child
		if(c2>size) 
			c=c1;
		else {
			//if there are 2 children, identify the smallest child in two children
			if(a[c1]<a[c2])
				c=c1;
			else
				c=c2;
		}
		
		//Swap the parent with child
		if(a[p]>a[c]) {
			int t;
			t=a[p];
			a[p]=a[c];
			a[c]=t;
		}
		
		heapifyTtoB(c);
	}
	
	int extractMin() {
		if(size==0) {
			System.out.println("No elements present in array");
			return -1;
		}
		int value=a[1];
		a[1]=a[size];
		size--;
		heapifyTtoB(1);
		return value;
	}
	
	int size() {
		return size;
	}
	
	public void traverse() {
		for(int i=1;i<=size;i++)
			System.out.println(a[i]);
	}
	
	private void heapifyBtoT(int c) {
		if(c<=1)
			return;
		int p=c/2;
		if(a[p]>a[c]) {
			int t;
			t=a[p];
			a[p]=a[c];
			a[c]=t;
		}
		heapifyBtoT(p);
	}
	
	public void insert(int data) {
		if(size==a.length-1) {
			System.out.println("Array is full");
			return;
		}
		a[++size]=data;
		heapifyBtoT(size);
	}
}
