package day2;

public class BMIDemo3 {

	public static void main(String[] args) {
		// 建立物件實體
		BMIUser user1 = new BMIUser();
		// 資料設定
		user1.name = "小明";
		user1.h = 170.0;
		user1.w = 60.0;
		// 執行邏輯(方法)
		user1.printBMI();
		
		
		BMIUser user2 = new BMIUser();
		// 資料設定
		user2.name = "小白";
		user2.h = 180.0;
		user2.w = 84.2;
		// 執行邏輯(方法)
		user2.printBMI();
		
		BMIUser user3 = new BMIUser("小華", 175.5, 72.7);
		user3.printBMI();
		
	}
	
	
}
