package Throws;
import Interface.A;

public class E implements A {
	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		E e1 = new E();
		e1.test();
	}

}
