package queue;

public class QueueArrayMain {
	
	public static void main(String[] args) {
		QueueArray queue=new QueueArray(3);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		
		System.out.println(queue.getB());
		System.out.println(queue.getE());
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		
		queue.insert(40);
		queue.insert(50);
		queue.insert(60);
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
		System.out.println(queue.delete());
	}

}
