package day7.lab1;

public class ApplePay extends AbstractPayment{

	public static final double RATE = 0.02;
	
	@Override
	public void pay(double amount) {
		double fee = calculateFee(amount); // 手續費
		System.out.printf("ApplePay付款: %.1f 手續費: %.1f%n",amount, fee);

	}

	@Override
	public void refund(double amount) {
		System.out.printf("ApplePay退款: %.1f%n",amount);

	}

	@Override
	public double calculateFee(double amount) {
		return amount * RATE;
	}

}
