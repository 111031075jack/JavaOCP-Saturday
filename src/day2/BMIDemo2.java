package day2;

public class BMIDemo2 {

	public static void main(String[] args) {
		// 計算某人的 bmi 資料
		// 需要該人的身高與體重
		// bmi 公式 w / 身高m * 身高m
		// 原始資料
		String name = "小明";
		double w = 60.0;
		double h = 170.0;
		
		// 計算
		double bmi = calcBMI(h, w);
	
		// 印出結果
		printBMI(name, h, w, bmi);
		
		//-----------------------------------------------
		System.out.println("------------------------------");
		String name2 = "小白";
		double h2 = 180.0;
		double w2 = 84.0;
		
		// 計算
		double bmi2 = calcBMI(h2, w2);
	
		// 印出結果
		printBMI(name2, h2, w2, bmi2);
		 
		
	}
	
	// 計算
	private static double calcBMI(double h, double w) {
		double bmi = w/ Math.pow(h/100, 2);
		return bmi; // 回傳計算結果
	}
	
	
	// 印出結果
	private static void printBMI(String name, double h, double w, double bmi) {
		System.out.println("BMI 執行資料結果:");
		System.out.printf("姓名: %s %n", name);
		System.out.printf("身高: %.1f cm %n", h);
		System.out.printf("體重: %.1f kg %n", w);
		System.out.printf("bmi: %.2f %n", bmi);
	}
	
	
}
