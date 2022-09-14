package Throws;

public class B {

	public static void main(String[] args) {
		A a1= new A();
		try {
			a1.test();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("From B");
	}

}
