package day7.lab1;

public interface Payment {
	
	/** 
	 *                 +---------+
	 *                 | Payment |  <interface>
	 *                 +---------+
	 *                      ^
	 *                      |   implements
	 *             +-----------------+
	 *             | AbstractPayment |  <abstract class>
	 *             +-----------------+
	 *              ^       ^       ^   
	 *              |       |       |    extends
	 * +------------+  +---------+  +----------+
	 * | CreditCard |  | LinePay |  | ApplePay |
	 * +------------+  +---------+  +----------+
	 * */
	
	void pay(double amount); // 付款
	void refund(double amount); // 付款
	
	
}
