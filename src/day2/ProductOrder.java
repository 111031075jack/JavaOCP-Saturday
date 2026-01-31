package day2;

/**
 * 物件要有 3 個屬性（資料）
String productName：商品名稱
double unitPrice：單價（NT$）
int count：購買數量

物件要有 2 個方法（邏輯）
private double calcTotalPrice()：計算總價 = 單價 × 數量，回傳 double。
public void printOrder()：印出訂單明細，格式如下：
=================================================================
商品訂單明細:
商品: 蘋果
單價: NT$ 40.0 
數量: 5 個
總價: NT$ 200.0 
 * */


public class ProductOrder {

	String productName;
	double unitPrice;
	int count;
	
	private double calcTotalPrice() {
		double totalPrice = unitPrice * count;
		return totalPrice;
	}

	public void printOrder() {
		System.out.println("商品訂單明細:");
		System.out.printf("商品: %s%n", productName);
		System.out.printf("單價: NT$ %.1f%n", unitPrice);
		System.out.printf("數量: %d%n", count);
		System.out.printf("總價: NT$ %.1f%n", calcTotalPrice());
		
	}
	
	public ProductOrder() {
		
	}
	
	public ProductOrder(String productName, double unitPrice, int count) {
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.count = count;
	}

	
	
}
