package day4;


public class Account {
	
	private String number; // 帳號
	private String name; // 戶名
	private int balance; // 存款金額
	
	// 建構子(建立帳號物件)
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	// getter/setter
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 商業邏輯 (存/提/轉帳)
	public void disposit(int amount) {
		/*
		if(amount > 0) {
			balance += amount;
		}
		*/
		
		if(amount <= 0) {
			System.err.println("存款失敗");
			return;
		}
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(amount <= 0 || amount > balance) {
			System.err.println("提款失敗");
			return;
		}
			
		balance -= amount;
	}
		
	public void transfer(int amount, Account other) {
		if(amount <= 0 || amount > balance) {
			System.err.println("轉帳失敗");
			return;
		}
		
		this.withdraw(amount); // 提款
		other.disposit(amount);// 存款
	}
	
	// 將物件內的資料以字串回傳
	public String toString() {
		return String.format("帳號:%s 戶名:%s 存款: %d%n", number, name, balance);
	}
	
}
