package Abstract;

public class B extends A {
	B(){
		super(100);
	}
	public void test() {
		System.out.println("Test");
	}

	public static void main(String[] args) {
		A a1 = new B();
		a1.test();
		a1.xyz();
	}

}
