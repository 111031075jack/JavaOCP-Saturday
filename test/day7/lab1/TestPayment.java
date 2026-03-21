package day7.lab1;

public class TestPayment {

	public static void main(String[] args) {
		Payment payment1 = new CreditCard();
		Payment payment2 = new LinePay();
		Payment payment3 = new ApplePay();
		
		Payment[] payments = {payment1, payment2, payment3};
		
		for(Payment payment : payments) {
			// 付款
			System.out.println("=== 付款測試 ===");
			payment.pay(10000);
			// 退款
			System.out.println("=== 退款測試 ===");
			payment.refund(10000);
		System.out.println();		
		}
		
		/*
		// 付款
		System.out.println("=== 付款測試 ===");
		payment1.pay(10000);
		payment2.pay(100000);
		payment3.pay(100000);
		
		// 退款
		System.out.println("\n=== 退款測試 ===");
		payment1.refund(10000);
		payment2.refund(100000);
		payment3.refund(100000);
		*/
	}
	
}
