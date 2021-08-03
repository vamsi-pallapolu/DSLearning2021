package tree;

public class BinaryHeapArrayMain {
	
	public static void main(String[] args) {
		BinaryHeapArray heap=new BinaryHeapArray(10);
		heap.insert(5);
		heap.insert(6);
		heap.insert(7);
		heap.insert(8);
		heap.insert(9);
		heap.insert(1);
		heap.traverse();
		System.out.println("Size:"+heap.size());
		int min=heap.extractMin();
		System.out.println("Minium:"+min);
		heap.traverse();
		min=heap.extractMin();
		System.out.println("Minium:"+min);
		heap.traverse();
		min=heap.extractMin();
		System.out.println("Minium:"+min);
		heap.traverse();
		System.out.println("Size:"+heap.size());
	}

}
