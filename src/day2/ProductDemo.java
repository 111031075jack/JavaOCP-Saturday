package day2;

/**
 * main 程式要求（在 ProductDemo 類別）
建立 3 個訂單物件：
先 new 空物件，再逐一設定屬性（買「橘子」）。
再 new 一個空物件，設定屬性（買「香蕉」）。
用建構子一次建立（買「鳳梨」，用雙參數建構子？等下自己想）。
每個訂單都叫 printOrder()。

範例執行結果
商品訂單明細:
商品: 橘子
單價: NT$ 35.0 
數量: 3 個
總價: NT$ 105.0 
===========
商品訂單明細:
商品: 香蕉
單價: NT$ 25.0 
數量: 8 個
總價: NT$ 200.0 
===========
商品訂單明細:
商品: 鳳梨
單價: NT$ 80.0 
數量: 2 個
總價: NT$ 160.0 
===========
 * */

public class ProductDemo {

	public static void main(String[] args) {
		ProductOrder order1 = new ProductOrder();
		order1.productName = "橘子";
		order1.unitPrice = 35.0;
		order1.count = 3;
		order1.printOrder();
		System.out.println("==========================");
		
		ProductOrder order2 = new ProductOrder();
		order2.productName = "香蕉";
		order2.unitPrice = 25.0 ;
		order2.count = 8;
		order2.printOrder();
		System.out.println("==========================");
		
		ProductOrder order3 = new ProductOrder("鳳梨", 80.0, 2);
		order3.printOrder();
		
	}
	
}
