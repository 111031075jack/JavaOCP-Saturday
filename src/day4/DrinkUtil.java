package day4;

// 處理飲料相關工作
public class DrinkUtil {

	/*
	 * 解析訂單字串
	 * "1, 3x2" -> [1號x1杯, 3號x2杯] -> OrderItem[]
	 */
	public static OrderItem[] inputParseAndGetOrderItems(String input) {
		String[] inputArray = input.split(","); // ["1", "3x2"]
		OrderItem[] oItems = new OrderItem[inputArray.length]; // inputArray.length = 2 
		int i=0; // oItems 起始要放的位置
		
		for(String item : inputArray) {
			item = item.trim();
			System.out.printf("item: %s%n", item);
			
			int number = 0; // 飲料編號
			int qty = 0; // 飲料數量
			// 判斷是否有 "x"
			if(item.contains("x")) {
				String[] array = item.split("x"); // ["3", "2"]
				number = Integer.parseInt(array[0]); // 字串轉int
				qty = Integer.parseInt(array[1]); // 字串轉int
			} else {
				number = Integer.parseInt(item); // item 就是飲料編號
				qty = 1;
			}
			// 印出結果
			System.out.printf("%d號x%d杯%n", number, qty);
			
			// 找飲料並建立訂單項目
			Drink drink = DrinkMenu.findByNumber(number);
			// 若沒有該編號的飲料, 則當次迴圈不往下執行
			if(drink == null) {
				System.out.println("查無商品\n");
				continue;
			}
			// 建立訂單
			OrderItem oItem = new OrderItem(drink, qty);
			oItems[i] = oItem; // 將 orderItem 放到 oItems 陣列中 
			i++; // 很重要
		}
		return oItems;
	
	}
}
