package Interface;

public class B implements A {
	public void test() {
		System.out.println("From test");
	}
	public void xyz() {
		System.out.println("From XYZ");
	}

	public static void main(String[] args) {
		B b = new B();
		b.test();
		b.xyz();
	}

}
