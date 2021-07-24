package list;

public class CDLLMain {
	
	public static void main(String[] args) {
		CDLL ob=new CDLL();
		ob.createNode(10);
		ob.insert(0, 5);
		ob.insert(3, 12);
		ob.insert(1, 4);
		
		ob.delete(0);
		ob.traverse();
		System.out.println("size:"+ob.getSize());
		ob.delete(3);
		ob.traverse();
		ob.reverse();
		ob.delete(1);
		ob.traverse();
		
	}
}
