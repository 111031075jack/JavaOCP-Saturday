package day2;

public class BMIDemo1 {

	public static void main(String[] args) {
		// 計算某人的 bmi 資料
		// 需要該人的身高與體重
		// bmi 公式 w / 身高m * 身高m
		String name = "小明";
		double w = 60.0;
		double h = 170.0;
		double bmi = w / Math.pow(h/100.0, 2);
		
		System.out.println("BMI 資料結果");
		System.out.printf("姓名: %s%n身高: %.1fcm%n體重: %.1fkg%nBMI: %.2f",
				name, h, w, bmi);
		
	}
	
	
}
