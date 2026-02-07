package day2;

/**
 * 物件要有 3 個屬性
String flavor：口味（如「原味」、「辣味」、「檸檬」）
double price：單價（NT$）
int pieces：雞排塊數

物件方法
public void printOrder()：印出訂單資料
雞排訂單: 原味
單價: $45 塊數: 6
總額: $270
=======
public double getTotal()：回傳這筆訂單總金額

共用的 static 類別方法：
public static double getStoreTotal(ChickenOrder[] orders)：整天總營收
public static double getAverageOrder(ChickenOrder[] orders)：平均每筆訂單
 * */

public class ChickenOrder {
	
	public ChickenOrder() {
		
	}

	public ChickenOrder(String flavor, double price, int pieces) {
		this.flavor = flavor;
		this.price = price;
		this.pieces = pieces;
	}

	private String flavor;
	private double price;
	private int pieces;
	
	// 印出訂單資料
	public void printOrder() {
		System.out.printf("雞排訂單: %s%n", flavor);
		System.out.printf("單價: $%.1f%n", price);
		System.out.printf("塊數: %d%n", pieces);
		System.out.printf("總價: $%.1f%n", getTotal());
		
	}
	
	// 回傳這筆訂單總金額
	public double getTotal() {
		double sum = price * pieces;
		return sum;
	}
	
	//----------------------------------------------------------------
	// 共用方法: 
	
	// 整天總營收
	public static double getStoreTotal(ChickenOrder[] orders) {
		double total = 0;
		for(int i=0;i<orders.length;i++) {
			total += orders[i].getTotal();
		}
		return total;
	}
	
	// 平均每筆訂單
	public static double getAverageOrder(ChickenOrder[] orders) {
		double sum = getStoreTotal(orders);
		double avg = sum / (double)orders.length;
		return avg;
	}
	
	// 印出所有訂單
	public static void printAll(ChickenOrder[] orders) {
		for(int i=0;i<orders.length;i++) {
			orders[i].printOrder();
		}
	}
	
	
}
