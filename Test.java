
public class Test {

	public static void main(String[] args) {
		String s="nifty";
		if(s instanceof String)
			System.out.println("true");
		
		int a=11;
		if(a<10)
			System.out.println("a is less than 10");
		else if(a>10)
			System.out.println("a is greater than 10");
		else
			System.out.println(" a is 10 ");
	}
}
