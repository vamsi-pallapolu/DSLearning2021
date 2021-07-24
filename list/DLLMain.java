package list;

public class DLLMain {
	
	public static void main(String[] args) {
		DLL dll=new DLL();
		dll.createNode(10);
		dll.insert(0, 2);
		dll.insert(2, 7);
		dll.insert(2,11);
		dll.traverse();
		dll.delete(0);
		dll.traverse();
		dll.delete(3);
		dll.traverse();
		dll.delete(1);
		dll.traverse();
		dll.delete(2);
		dll.traverse();
	}

}
