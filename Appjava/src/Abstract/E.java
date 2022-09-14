package Abstract;

public class E extends D implements C {
	public void test() {
		System.out.println("Test 1");
		
	}

	public void xyz() {
		System.out.println("Test 2");
		
	}

	public static void main(String[] args) {
		E e1 = new E();
		e1.test();
		e1.xyz();

	}

	

}
