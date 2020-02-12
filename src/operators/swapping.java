package operators;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		System.out.println("before swapping");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		
		a = a+b;//30
		b = a-b;//10
		a = a-b;//20
		
		System.out.println("after swapping");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		
	}

}
