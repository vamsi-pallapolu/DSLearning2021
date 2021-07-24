package queue;

public class QueueListMain {
	
	public static void main(String[] args) {
		QueueList q=new QueueList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println("size:"+q.getSize());
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println("size:"+q.getSize());
		System.out.println(q.dequeue());
		System.out.println("size:"+q.getSize());
	}

}
