package list;

public class CSLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSLL list=new CSLL();
		list.createNode(10);
		list.insert(0, 5);
		list.insert(2, 12);
		list.insert(1, 7);
		//list.traverse();
		list.delete(0);
		//list.traverse();
		list.delete(4);
		list.traverse();
		list.delete(1);
		list.traverse();
	}

}
