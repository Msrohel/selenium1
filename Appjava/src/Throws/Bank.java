package Throws;

public class Bank {

	public static void main(String[] args) {
		int balance=5000;
		int amount=10000;
		
		if(amount>balance) {
			try {
				throw new InsufficientFund();
			}catch(InsufficientFund e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Please collect your cash");
		}
	}

}