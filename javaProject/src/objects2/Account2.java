package objects2;

public class Account2 {
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	
	static final int MIN_BALANCE = 0;
	
	public Account2() {
		
	}
	
	public Account2(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance==0)
			this.balance = balance;
		else
			this.balance += balance;
	}
	
	public void setBalance(String n, int balance) {
		if(n.equals("+")) {
			this.balance += balance;
		}else if(n.equals("-")) {
			this.balance -= balance;
		}
		
			
	}
	
}
