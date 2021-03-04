package objects2;

public class Account {
	
	private int balance;

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	Account(){
		
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		int sum = 0;

		if(balance < MAX_BALANCE && balance >= MIN_BALANCE) {
			sum += balance ;
			this.balance = sum;
		}else {
			//현재 balance값 유지.
		}
		
	}
	
	
}
