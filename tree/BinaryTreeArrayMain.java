package tree;

public class BinaryTreeArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeArray ob=new BinaryTreeArray(5);
		ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		//ob.traverse();
		//System.out.println(ob.last_index);
		//ob.inOrder(1);
		//ob.preOrder(1);
		ob.delete(1);
		ob.delete(2);
		ob.delete(4);
		ob.delete(3);
		System.out.println(ob.last_index);
		ob.traverse();
		
	}

}
