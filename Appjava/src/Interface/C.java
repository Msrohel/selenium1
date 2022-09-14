package Interface;

public class C implements F{
	public void test() {
		System.out.println("Test");
	}
	public void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		c1.test1();
		c1.test2();
	}

}
