package list;

public class SLLMain {
	
	public static void main(String[] args) {
		SLL list=new SLL();
		list.createNode(4);
		list.insert(3,0);
		list.insert(2,0);
		list.insert(1,0);
		list.traverse();
		
		list.delete(5);
		list.traverse();
		
	}

}
