package stack;

public class StackListMain {
	
	public static void main(String[] args) {
		StackList ob=new StackList();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}
}
