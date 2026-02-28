package day4;

public class TestAccount {

	public static void main(String[] args) {
		System.out.println("測試資料");
		System.out.println("==========================");
		
		// 建立2組帳號可以存/提款/轉帳/列印資訊
		
		Account A = new Account("2026001", "Jack", 225000); 
		Account B = new Account("2004033", "Bob", 60000); 
		System.out.println(A); // 會自動呼叫 toString 方法
		System.out.println(B);
		
		System.out.println("Jack 存款 3000");
		// Jack 存款 3000
		A.disposit(3000);
		System.out.println(A); 
		
		// Bob 提款 7000
		System.out.println("Bob 提款 7000");
		B.withdraw(7000);
		System.out.println(B);
		
		// Jack 轉給 Bob 5200 塊
		System.out.println("Jack 轉給 Bob 5200 塊");
		A.transfer(5200, B);
		System.out.println(A);
		System.out.println(B);
		
		System.out.println("=======================================");
		
		// Jack 存款 -3000
		System.out.println("Jack 存款 -3000");
		A.disposit(-3000);
		System.out.println(A); 
		
		// Bob 提款 770000
		System.out.println("Bob 提款 770000");
		B.withdraw(770000);
		System.out.println(B);
		
		// Jack 轉給 Bob 520000 塊
		System.out.println("Jack 轉給 Bob 520000 塊");
		A.transfer(520000, B);
		System.out.println(A);
		System.out.println(B);
		
	}
	
}
