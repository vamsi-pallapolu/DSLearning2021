
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test bst=new Test();
		bst.insert(40);
		bst.insert(30);
		bst.insert(50);
		bst.insert(20);
		bst.insert(10);
		bst.insert(25);
		bst.traverse();
		System.out.println("-------------");
		bst.delete(10);
		bst.delete(20);
		bst.insert(60);
		bst.insert(45);
		bst.insert(42);
		bst.insert(47);
		bst.delete(40);
		bst.delete(42);
		bst.traverse();
		bst.search(47);
		bst.search(100);
	}

}
