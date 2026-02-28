package day4;

public class TestSplit {

	public static void main(String[] args) {
		System.out.println("測試資料");
		System.out.println("==========================");
		
		// "1, 3x2" 
		// 1號x1杯
		// 3號x2杯
		
		String input = "1, 3x2";
		String[] inputArray = input.split(","); // ["1", "3x2"]
		
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
		}
		
	}
	
}
