package Throws;

public class A {
	public void test() throws Exception, NullPointerException{
		int i=10/0;
		System.out.println(i);

	}

}
