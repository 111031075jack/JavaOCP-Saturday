package day1;

import java.util.Scanner;

public class CoffeeShop {

	/**
 * 請選擇咖啡：
	1. 熱咖啡
	2. 冰咖啡
	輸入選項：2
	
	請選擇甜度：
	1. 無糖
	2. 微糖
	3. 半糖
	4. 全糖
	輸入選項：1
	
	請選擇冰量：
	1. 去冰
	2. 微冰
	3. 少冰
	4. 正常冰
	輸入選項：3
	
	=== 你的咖啡訂單 ===
	種類：冰咖啡
	甜度：無糖
	冰量：少冰
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 咖啡選擇
		System.out.println("請選擇咖啡");
		System.out.println("1.熱咖啡");
		System.out.println("2.冰咖啡");
		System.out.print("請輸入選項 => ");
		int choice = sc.nextInt();
		
		// 容量選擇
		System.out.println("請選擇容量");
		System.out.println("1. 大");
		System.out.println("2. 中");
		System.out.println("3. 小");
		System.out.print("請輸入選項 => ");
		int size = sc.nextInt();
		
		// 甜度
		System.out.println("\n請選擇甜度");
		System.out.println("1. 無糖");
		System.out.println("2. 微糖");
		System.out.println("3. 半糖");
		System.out.println("4. 全糖");
		System.out.print("請輸入選項 => ");
		int sugar = sc.nextInt();
		
		// 冰量
		int ice  = 0; // 設定 ice 初始值 = 0
		if(choice == 2) {
			System.out.println("\n請選擇冰量");
			System.out.println("1. 去冰");
			System.out.println("2. 微冰");
			System.out.println("3. 少冰");
			System.out.println("4. 正常冰");
			System.out.print("請輸入選項 => ");
			ice = sc.nextInt(); // 變更 ice 內容
		}
		
		// 印出訂單
		System.out.println("\n你的咖啡訂單");
		
		switch (size) {
		case 1:
			System.out.print("大杯");
			break;
		case 2:
			System.out.print("中杯");
			break;
		case 3:
			System.out.print("小杯");
			break;
		}
	
		
		switch (choice) {
			case 1:
				System.out.println("熱咖啡");
				break;
			case 2:
				System.out.println("冰咖啡");
				break;
		}
		
		switch(sugar) {
			case 1:
				System.out.println("無糖");
				break;
			case 2:
				System.out.println("微糖");
				break;
			case 3:
				System.out.println("半糖");
				break;
			case 4:
				System.out.println("全糖");
				break;
		}
		
		
		
		switch(ice) {
			case 1:
				System.out.println("去冰");
				break;
			case 2:
				System.out.println("微冰");
				break;
			case 3:
				System.out.println("少冰");
				break;
			case 4:
				System.out.println("正常冰");
				break;
		}
		sc.close();
	}
}
